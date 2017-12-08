package org.openhab.ui.habot.nlp.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.smarthome.core.events.EventPublisher;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.voice.text.HumanLanguageInterpreter;
import org.eclipse.smarthome.core.voice.text.InterpretationException;
import org.openhab.ui.habot.nlp.ChatReply;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(service = HumanLanguageInterpreter.class, immediate = true)
public class OpenNLPInterpreter implements HumanLanguageInterpreter {

    private static final Set<Locale> supportedLocales = Collections
            .unmodifiableSet(new HashSet<>(Arrays.asList(Locale.ENGLISH, Locale.FRENCH)));

    private IntentTrainer intentTrainer = null;
    private Locale currentLocale = null;

    private ItemRegistry itemRegistry;
    private EventPublisher eventPublisher;

    private HashMap<String, Skill> skills = new HashMap<String, Skill>();

    @Override
    public String getId() {
        return "opennlp";
    }

    @Override
    public String getLabel(Locale locale) {
        return "HABot OpenNLP Interpreter";
    }

    @Override
    public String interpret(Locale locale, String text) throws InterpretationException {
        ChatReply reply = reply(locale, text);
        if (reply == null) {
            return null;
        }

        return reply.getAnswer();
    }

    /**
     * This variant of interpret() returns a more complete interpretation result.
     *
     * @param locale
     * @param text
     * @return the interpretation result as a {@link ChatReply} object
     * @throws InterpretationException
     */
    public ChatReply reply(Locale locale, String text) throws InterpretationException {
        if (!locale.equals(currentLocale) || intentTrainer == null) {
            try {
                intentTrainer = new IntentTrainer(locale.getLanguage(), skills.values());
                currentLocale = locale;
            } catch (Exception e) {
                InterpretationException fe = new InterpretationException(
                        "Error during trainer initialization: " + e.getMessage());
                fe.initCause(e);
                throw fe;
            }
        }

        ChatReply reply = new ChatReply(locale, text);
        Intent intent = intentTrainer.interpret(text);
        reply.setIntent(intent);
        Skill skill = skills.get(intent.getName());

        if (skill != null) {
            IntentInterpretation intentInterpretation = skill.interpret(intent, locale.getLanguage());
            if (intentInterpretation != null) {
                reply.setAnswer(intentInterpretation.getAnswer());
                if (intentInterpretation.getMatchedItems() != null) {
                    reply.setMatchedItems(intentInterpretation.getMatchedItems().stream().map(i -> i.getName())
                            .collect(Collectors.toList()).toArray(new String[0]));
                }
                if (intentInterpretation.getCard() != null) {
                    reply.setCard(intentInterpretation.getCard());
                }
            }
        }

        return reply;
    }

    @Override
    public String getGrammar(Locale locale, String format) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Locale> getSupportedLocales() {
        return supportedLocales;
    }

    @Override
    public Set<String> getSupportedGrammarFormats() {
        return Collections.emptySet();
    }

    @Reference
    public void setItemRegistry(ItemRegistry itemRegistry) {
        if (this.itemRegistry == null) {
            this.itemRegistry = itemRegistry;
            // this.itemRegistry.addRegistryChangeListener(registryChangeListener);
        }
    }

    public void unsetItemRegistry(ItemRegistry itemRegistry) {
        if (itemRegistry == this.itemRegistry) {
            // this.itemRegistry.removeRegistryChangeListener(registryChangeListener);
            this.itemRegistry = null;
        }
    }

    @Reference
    public void setEventPublisher(EventPublisher eventPublisher) {
        if (this.eventPublisher == null) {
            this.eventPublisher = eventPublisher;
        }
    }

    public void unsetEventPublisher(EventPublisher eventPublisher) {
        if (eventPublisher == this.eventPublisher) {
            this.eventPublisher = null;
        }
    }

    @Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
    public void addSkill(Skill skill) {
        this.skills.put(skill.getIntentId(), skill);
        // reset the trainer
        this.intentTrainer = null;
    }

    public void removeSkill(Skill skill) {
        this.skills.remove(skill.getIntentId());
        // reset the trainer
        this.intentTrainer = null;
    }
}
