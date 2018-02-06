package org.openhab.ui.habot.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;
import org.openhab.ui.habot.nlp.UnsupportedLanguageException;
import org.openhab.ui.habot.nlp.internal.IntentTrainer;

public class TrainerTest {

    private List<Skill> skills;

    public class MockSkill implements Skill {

        private String intent;

        public MockSkill(String intent) {
            this.intent = intent;
        }

        @Override
        public String getIntentId() {
            return intent;
        }

        @Override
        public InputStream getTrainingData(String language) throws UnsupportedLanguageException {
            return MockSkill.class.getClassLoader().getResourceAsStream("train/" + language + "/" + intent + ".txt");
        }

        @Override
        public IntentInterpretation interpret(Intent intent, String language) {
            // TODO Auto-generated method stub
            return null;
        }
    }

    @Before
    public void initializeMockSkills() {
        skills = new ArrayList<Skill>();

        skills.add(new MockSkill("get-status"));
        skills.add(new MockSkill("activate-object"));
        skills.add(new MockSkill("get-history-daily"));
        skills.add(new MockSkill("get-history-hourly"));
        skills.add(new MockSkill("get-history-last-changes"));
    }

    @Test
    public void testEN() throws Exception {
        IntentTrainer trainer = new IntentTrainer("en", skills);

        System.out.println(trainer
                .interpret("show me a graph of the temperature in the living room for the last 3 hours").toString());
        System.out.println(trainer.interpret("show me the temperature in the kitchen").toString());
        System.out.println(trainer.interpret("start the heating in the garage").toString());
        System.out.println(trainer.interpret("Temperature in the bedroom?").toString());
        System.out.println(trainer.interpret("start the ac please!").toString());
        System.out.println(trainer.interpret("what's the temperature in the garage?").toString());
        System.out.println(trainer.interpret("show a graph of the electricity consumption over 2 days").toString());
        System.out.println(trainer.interpret("turn on the lights in the kitchen").toString());
    }

    @Test
    public void testFR() throws Exception {
        IntentTrainer trainer = new IntentTrainer("fr", skills);

        System.out.println(trainer
                .interpret("donne-moi un graphique de la température du salon pour les dernières heures").toString());
        System.out.println(trainer.interpret("montre-moi la température du salon").toString());
        System.out.println(trainer.interpret("Température du salon ?").toString());
        System.out.println(trainer.interpret("active le thermostat dans le garage").toString());
        System.out.println(trainer.interpret("mets en route la climatisation").toString());
        System.out.println(trainer
                .interpret("montre le graphique de la consommation électrique pour les 2 derniers jours").toString());
    }

}
