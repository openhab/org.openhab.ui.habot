package org.openhab.ui.habot.nlp.internal.skill;

import org.openhab.ui.habot.card.Card;
import org.openhab.ui.habot.nlp.AbstractItemIntentInterpreter;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;

@org.osgi.service.component.annotations.Component(service = Skill.class)
public class CreateRuleSkill extends AbstractItemIntentInterpreter {

    @Override
    public String getIntentId() {
        return "create-rule";
    }

    @Override
    public IntentInterpretation interpret(Intent intent, String language) {
        IntentInterpretation interpretation = new IntentInterpretation();
        Card card = new Card("HbCreateRuleCard");
        // TODO: try to parse a day/time to pre-configure the new rule card
        interpretation.setAnswer(answerFormatter.getRandomAnswer("answer_create_rule"));
        interpretation.setCard(card);
        return interpretation;
    }

}
