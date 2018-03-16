package org.openhab.ui.habot.test;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.IntentInterpretation;
import org.openhab.ui.habot.nlp.Skill;
import org.openhab.ui.habot.nlp.UnsupportedLanguageException;
import org.openhab.ui.habot.nlp.internal.IntentTrainer;

public class TrainerTest {

    IntentTrainer trainer = null;

    List<Skill> skills;

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
        skills.add(new MockSkill("deactivate-object"));
        skills.add(new MockSkill("get-history-daily"));
        skills.add(new MockSkill("get-history-hourly"));
        skills.add(new MockSkill("get-history-weekly"));
        skills.add(new MockSkill("get-history-monthly"));
        skills.add(new MockSkill("get-history-last-changes"));
    }

    protected Intent interpret(String query) {
        System.out.println("----");
        System.out.println("\"" + query + "\"");
        System.out.println(new TreeMap<>(this.trainer.getScoreMap(query)).descendingMap().toString());
        Intent intent = this.trainer.interpret(query);
        System.out.println(intent.toString());
        return intent;
    }

    @Test
    public void testEN() throws Exception {

    	Intent actual;
        this.trainer = new IntentTrainer("en", skills);

        actual = interpret("Temperature in the bedroom?");
        assertEquals("get-status", actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("bedroom", actual.getEntities().get("location"));
        assertEquals("temperature", actual.getEntities().get("object"));

        actual = interpret("show me the temperature in the kitchen");
        assertEquals("get-status", actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("kitchen", actual.getEntities().get("location"));
        assertEquals("temperature", actual.getEntities().get("object"));        
        
        actual = interpret("what's the temperature in the garage?");

        actual = interpret("start the heating in the garage");
        actual = interpret("start the ac please!");
        actual = interpret("turn on the lights in the kitchen");
        actual = interpret("please switch the lights in the kitchen on");
        actual = interpret("please turn off the radiators");
        actual = interpret("deactivate the alarm");
        actual = interpret("stop the music in the living room");

        actual = interpret("show me a graph of the temperature in the living room for the last 3 hours");
        actual = interpret("graph the water consumption for the last 2 days");
        actual = interpret("i'd like a chart of the humidity over 2 weeks");
        actual = interpret("temperature in the downstairs corridor for the last month");
        actual = interpret("luminosity in the living room over 6 months");

        actual = interpret("when was the alarm turned on for the last time?");
        actual = interpret("show me the last state changes of the window in the bedroom");
    }

    @Test
    public void testFR() throws Exception {
        Intent actual;
        this.trainer = new IntentTrainer("fr", skills);

        actual = interpret("donne-moi un graphique de la température du salon pour les dernières heures");
        actual = interpret("montre-moi la température du salon");
        actual = interpret("Température du salon ?");
        actual = interpret("active le thermostat dans le garage");
        
        actual = interpret("mets en route la climatisation");
        assertEquals("activate-object", actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("climatisation", actual.getEntities().get("object"));       
        
        actual = interpret("montre le graphique de la consommation électrique pour les 2 derniers jours");
        assertEquals("get-history-daily", actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("2", actual.getEntities().get("period"));
        assertEquals("consommation électrique", actual.getEntities().get("object"));
    }

    @Test
    public void testDE_activateObjects() throws Exception {

        Intent actual;
        this.trainer = new IntentTrainer("de", skills);

        actual = interpret("mach den Fernseher an");
        assertEquals("activate-object", actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("fernseher", actual.getEntities().get("object"));

        actual = interpret("bitte mache das Licht an");
        assertEquals("activate-object", actual.getName());
        assertEquals(1, actual.getEntities().size());
         assertEquals("licht", actual.getEntities().get("object"));
    }

    @Test
    public void testDE_deactivateObjects() throws Exception {

        Intent actual;
        this.trainer = new IntentTrainer("de", skills);

        actual = interpret("Licht aus");
        assertEquals("deactivate-object", actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("licht", actual.getEntities().get("object"));

        actual = interpret("mach den Fernseher aus");
        assertEquals("deactivate-object", actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("fernseher", actual.getEntities().get("object"));

        actual = interpret("bitte mache das Licht aus");
        assertEquals("deactivate-object", actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("licht", actual.getEntities().get("object"));
    }

    @Test
    public void testDE_getStatus() throws Exception {

        Intent actual;
        this.trainer = new IntentTrainer("de", skills);

        actual = interpret("Heizung in der Küche");
        assertEquals("get-status", actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("heizung", actual.getEntities().get("object"));
        assertEquals("küche", actual.getEntities().get("location"));

        actual = interpret("wie hoch ist die Temperatur im Wohnzimmer");
        assertEquals("get-status", actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("temperatur", actual.getEntities().get("object"));
        assertEquals("wohnzimmer", actual.getEntities().get("location"));

        actual = interpret("wie hoch ist die Temperatur im Keller");
        assertEquals("get-status", actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("temperatur", actual.getEntities().get("object"));
        assertEquals("keller", actual.getEntities().get("location"));
    }
}
