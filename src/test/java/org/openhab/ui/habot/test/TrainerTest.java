package org.openhab.ui.habot.test;

import static org.junit.Assert.*;

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
	
	    public class Skills {
        public final static String GET_STATUS = "get-status";
        public final static String ACTIVATE_OBJECT = "activate-object";
        public final static String DEACTIVATE_OBJECT = "deactivate-object";
        public final static String GET_HISTORY_HOURLY = "get-history-hourly";
        public final static String GET_HISTORY_DAILY = "get-history-daily";
        public final static String GET_HISTORY_WEEKLY = "get-history-weekly";
        public final static String GET_HISTORY_MONTHLY = "get-history-monthly";
        public final static String GET_HISTORY_LAST_CHANGES = "get-history-last-changes";
    }

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

    protected void checkInterpretation(String intentName, String query, String object, String location) {
        Intent actual = interpret(query);

        assertEquals(intentName, actual.getName());

        if (object != null) {
            assertTrue(actual.getEntities().containsKey("object"));
            assertEquals(object, actual.getEntities().get("object"));
        }

        if (location != null) {
            assertTrue(actual.getEntities().containsKey("location"));
            assertEquals(location, actual.getEntities().get("location"));
        }
    }

    protected void assertIs(String intentName, String query) {
        checkInterpretation(intentName, query, null, null);
    }

    protected void assertIsGetStatus(String query, String object, String location) {
        checkInterpretation("get-status", query, object, location);
    }

    protected void assertIsGetStatus(String query) {
        checkInterpretation("get-status", query, null, null);
    }

    protected void assertIsActivate(String query, String object, String location) {
        checkInterpretation("activate-object", query, object, location);
    }

    protected void assertIsActivate(String query) {
        checkInterpretation("activate-object", query, null, null);
    }

    protected void assertIsDeactivate(String query, String object, String location) {
        checkInterpretation("deactivate-object", query, object, location);
    }

    protected void assertIsDeactivate(String query) {
        checkInterpretation("deactivate-object", query, null, null);
    }

	@Test
	public void testEN() throws Exception {

		this.trainer = new IntentTrainer("en", skills);

        assertIsGetStatus("Temperature in the kitchen?", "temperature", "kitchen");
        assertIsGetStatus("show me the temperature in the kitchen", "temperature", "kitchen");
        assertIsGetStatus("what's the temperature in the garage?", "temperature", "garage");
        assertIsGetStatus("temperature in the corridor", "temperature", "corridor");
        assertIsGetStatus("temperature in the corridor", "temperature", "corridor");
        assertIsGetStatus("temperature on the first floor", "temperature", "first floor");
        assertIsGetStatus("tell me the temperature of the pool", "temperature", "pool");

        assertIsActivate("start the heating in the garage", "heating", "garage");
        assertIsActivate("start the boiler in the garage", "boiler", "garage");
        assertIsActivate("start the ac please!", "ac", null);
        assertIsActivate("put on some music please", "music", null);
        assertIsActivate("can you put some music in the kitchen please", "music", "kitchen");
        assertIsActivate("turn on the lights in the kitchen", "lights", "kitchen");
        assertIsActivate("please switch the lights in the kitchen on", "lights", "kitchen");
        assertIsActivate("i'd like some light in the bedroom", "light", "bedroom");
        assertIsActivate("i want some air conditioning in the bedroom", "air conditioning", "bedroom");
        assertIsDeactivate("please turn off the radiators", "radiators", null);
        assertIsDeactivate("deactivate the alarm", "alarm", null);
        assertIsDeactivate("stop the music in the living room", "music", "living room");
        assertIsDeactivate("i don't want music in the kitchen anymore", "music", "kitchen");
        assertIsDeactivate("i don't want any music in the kitchen anymore", "music", "kitchen");
        assertIsDeactivate("stop the washing machine", "washing machine", null);
        assertIsDeactivate("stop the air conditioning", "air conditioning", null);
        assertIsDeactivate("please could you stop the air conditioning", "air conditioning", null);
        assertIsDeactivate("no more lights please", "lights", null);

        checkInterpretation(Skills.GET_HISTORY_HOURLY,
                "show me a graph of the temperature in the living room for the last 3 hours", "temperature",
                "living room");
        checkInterpretation(Skills.GET_HISTORY_DAILY, "graph the water consumption for the last 2 days",
                "water consumption", null);
        checkInterpretation(Skills.GET_HISTORY_WEEKLY, "i'd like a chart of the humidity over 2 weeks", "humidity",
                null);
        checkInterpretation(Skills.GET_HISTORY_MONTHLY, "temperature in the downstairs corridor for the last month",
                "temperature", "downstairs corridor");
        checkInterpretation(Skills.GET_HISTORY_MONTHLY, "luminosity in the living room over 6 months", "luminosity",
                "living room");

        checkInterpretation(Skills.GET_HISTORY_LAST_CHANGES, "when was the alarm turned on for the last time?", "alarm",
                null);
        checkInterpretation(Skills.GET_HISTORY_LAST_CHANGES,
                "show me the last state changes of the window in the bedroom", "window", "bedroom");
	}

	@Test
	public void testFR() throws Exception {
		Intent actual;
        this.trainer = new IntentTrainer("fr", skills, null, "alphanumeric");

		actual = interpret("montre le graphique de la consommation électrique pour les 2 derniers jours");
		assertEquals("get-history-daily", actual.getName());
		assertEquals(2, actual.getEntities().size());
		assertEquals("2", actual.getEntities().get("period"));
		assertEquals("consommation électrique", actual.getEntities().get("object"));

        assertIs(Skills.GET_HISTORY_HOURLY,
                "donne-moi un graphique de la température du salon pour les dernières heures");
        assertIsGetStatus("montre-moi la température du salon");
        assertIsGetStatus("Température du salon ?");
        assertIsActivate("active le thermostat dans le garage");
        assertIsActivate("active le chauffage dans le salon");

        checkInterpretation(Skills.ACTIVATE_OBJECT, "mets en route la climatisation", "climatisation", null);

        assertIsDeactivate("arrête le chauffage dans le salon");
        assertIsDeactivate("stoppe la ventilation");
        assertIsDeactivate("éteins les lumières dans la cuisine");
        assertIsDeactivate("éteindre la lumière dans la salle à manger");
        assertIsDeactivate("arrêter l'air conditionné");
        assertIsDeactivate("arrête l'arrosage du jardin");
        assertIsDeactivate("arrête le volet du salon");

        assertIsGetStatus("lumières du couloir");
        assertIsGetStatus("lampes du couloir");
        assertIsGetStatus("chauffage dans la salle de bain");
        assertIsGetStatus("lumières dans la salle de bain");
        assertIsGetStatus("lumières dans la salle de bain");
        assertIsGetStatus("ventilation dans la salle de bain");
        assertIsGetStatus("température dans la chambre d'amis");
        assertIsGetStatus("lumière dans la salle de jeux");
        assertIsGetStatus("chauffage dans la buanderie");
        checkInterpretation(Skills.GET_HISTORY_DAILY, "température dans la salle de bain sur 3 jours", "température",
                "salle de bain");
        assertIsGetStatus("lampe dans la cage d'escalier");
        assertIsGetStatus("volet dans la cage d'escalier");
        assertIsGetStatus("arrosage dans le jardin");
        assertIsActivate("allume la lampe de la cage d'escalier");
        assertIsGetStatus("lampes du couloir");

        assertIs(Skills.GET_HISTORY_MONTHLY, "graphique mensuel de la température sur 2 mois");
        assertIs(Skills.GET_HISTORY_WEEKLY, "graphique de la température de la semaine");

        assertIsDeactivate("stoppe la ventilation");
        assertIsDeactivate("stoppe la chaudière");
        assertIsGetStatus("montre-moi l'état des lumières");
        assertIsGetStatus("montre-moi l'état du thermostat");
        assertIsGetStatus("montre-moi l'état de la consommation électrique");
        assertIsGetStatus("montre-moi les lampes");
        assertIsGetStatus("montre-moi le projecteur");
        assertIsGetStatus("montre-moi le lecteur dvd");
        assertIsGetStatus("montre-moi le chauffage");
        assertIsGetStatus("montre-moi un peu le thermostat");
        assertIsGetStatus("montre-moi le volet du salon");
        assertIsGetStatus("montre-moi la température de la cuisine");
        assertIsGetStatus("peux-tu me montrer le thermostat");

        assertIsActivate("allume l'ampli");
        assertIsActivate("mets de la musique");
        assertIsActivate("mets moi de la musique");
        assertIsDeactivate("je ne veux plus de chauffage dans le salon");
	}

	@Test
	public void testDE_activateObjects() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

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
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

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
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

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

	@Test
	public void testDE_historyHourly() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

		actual = interpret("wie ist der Verlauf der Temperatur der letzten Stunde?");
		assertEquals("get-history-hourly", actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));

		actual = interpret("Verlauf der Temperatur der letzten Stunde");
		assertEquals("get-history-hourly", actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));
	}

	@Test
	public void testDE_historyDaily() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

		actual = interpret("Verlauf der Temperatur der letzten 24 Stunden");
		assertEquals("get-history-daily", actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));

		actual = interpret("Verlauf der Luftfeuchtigkeit der letzten 24 Stunden");
		assertEquals("get-history-daily", actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("luftfeuchtigkeit", actual.getEntities().get("object"));

	}

	@Test
	public void testDE_historyWeekly() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

		actual = interpret("Verlauf der Temperatur der letzten Woche");
		assertEquals("get-history-weekly", actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));

		actual = interpret("Verlauf der Luftfeuchtigkeit der letzten Woche");
		assertEquals("get-history-weekly", actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("luftfeuchtigkeit", actual.getEntities().get("object"));

		actual = interpret("zeige die Wochenübersicht der Temperatur für die Küche");
		assertEquals("get-history-weekly", actual.getName());
		assertEquals(2, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));
		assertEquals("küche", actual.getEntities().get("location"));
	}

	@Test
	public void testDE_historyMonthly() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

		actual = interpret("Verlauf der Temperatur des letzten Monats");
		assertEquals("get-history-monthly", actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));

		actual = interpret("Verlauf der Luftfeuchtigkeit des letzten Monats");
		assertEquals("get-history-monthly", actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("luftfeuchtigkeit", actual.getEntities().get("object"));

		actual = interpret("Monatsübersicht der Temperatur für die Küche");
		assertEquals("get-history-monthly", actual.getName());
		assertEquals(2, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));
		assertEquals("küche", actual.getEntities().get("location"));
	}

    @Test
    public void testDE_historyLastChanges() throws Exception {

        Intent actual;
        this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

        actual = interpret("wann hat sich die Temperatur das letzte mal geändert?");
        assertEquals("get-history-last-changes", actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("temperatur", actual.getEntities().get("object"));
        
        actual = interpret("wann wurde der letzte Alarm ausgelöst?");
        assertEquals("get-history-last-changes", actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("alarm", actual.getEntities().get("object"));        
              
        actual = interpret("wann wurde der Status vom Licht im Wohnzimmer zuletzt geändert?");
        assertEquals("get-history-last-changes", actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("wohnzimmer", actual.getEntities().get("location"));
        assertEquals("licht", actual.getEntities().get("object"));
    }    
}
