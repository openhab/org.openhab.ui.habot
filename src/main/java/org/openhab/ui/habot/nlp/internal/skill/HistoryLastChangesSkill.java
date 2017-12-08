package org.openhab.ui.habot.nlp.internal.skill;

import org.openhab.ui.habot.card.Card;
import org.openhab.ui.habot.nlp.AbstractItemIntentInterpreter;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;

@org.osgi.service.component.annotations.Component(service = Skill.class)
public class HistoryLastChangesSkill extends AbstractItemIntentInterpreter {

    @Override
    public String getIntentId() {
        return "get-history-last-changes";
    }

    @Override
    public IntentInterpretation interpret(Intent intent, String language) {
        IntentInterpretation interpretation = new IntentInterpretation();
        interpretation.setAnswer(answerFormatter.getRandomAnswer("skill_not_implemented"));
        interpretation.setCard(new Card("HbDumpIntentCard"));
        return interpretation;
    }

}
