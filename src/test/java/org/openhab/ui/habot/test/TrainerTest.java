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
        public final static String SET_VALUE = "set-value";
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

        skills.add(new MockSkill(Skills.GET_STATUS));
        skills.add(new MockSkill(Skills.ACTIVATE_OBJECT));
        skills.add(new MockSkill(Skills.DEACTIVATE_OBJECT));
        skills.add(new MockSkill(Skills.GET_HISTORY_HOURLY));
        skills.add(new MockSkill(Skills.GET_HISTORY_DAILY));
        skills.add(new MockSkill(Skills.GET_HISTORY_WEEKLY));
        skills.add(new MockSkill(Skills.GET_HISTORY_MONTHLY));
        skills.add(new MockSkill(Skills.GET_HISTORY_LAST_CHANGES));
        skills.add(new MockSkill(Skills.SET_VALUE));
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
        checkInterpretation(Skills.GET_STATUS, query, object, location);
    }

    protected void assertIsGetStatus(String query) {
        checkInterpretation(Skills.GET_STATUS, query, null, null);
    }

    protected void assertIsActivate(String query, String object, String location) {
        checkInterpretation(Skills.ACTIVATE_OBJECT, query, object, location);
    }

    protected void assertIsActivate(String query) {
        checkInterpretation(Skills.ACTIVATE_OBJECT, query, null, null);
    }

    protected void assertIsDeactivate(String query, String object, String location) {
        checkInterpretation(Skills.DEACTIVATE_OBJECT, query, object, location);
    }

    protected void assertIsDeactivate(String query) {
        checkInterpretation(Skills.DEACTIVATE_OBJECT, query, null, null);
    }

    protected void assertIsSetValue(String query, String object, String location) {
        checkInterpretation(Skills.SET_VALUE, query, object, location);
    }

    protected void assertIsSetValue(String query) {
        checkInterpretation(Skills.SET_VALUE, query, null, null);
    }

    @Test
    public void testEN() throws Exception {
        this.trainer = new IntentTrainer("en", skills);

        assertIsGetStatus("Temperature in the kitchen?", "temperature", "kitchen");
        assertIsGetStatus("show me the temperature in the kitchen", "temperature", "kitchen");
        assertIsGetStatus("what's the temperature in the garage?", "temperature", "garage");
        assertIsGetStatus("temperature in the corridor", "temperature", "corridor");
        assertIsGetStatus("temperature on the first floor", "temperature", "first floor");
        assertIsGetStatus("tell me the temperature of the pool", "temperature", "pool");
        assertIsGetStatus("lights in the attic", "lights", "attic");
        assertIsGetStatus("lights in the basement", "lights", "basement");
        assertIsGetStatus("lights in the guest house", "lights", "guest house");
        assertIsGetStatus("corridor lights", "lights", "corridor");
        assertIsGetStatus("living room lights", "lights", "living room");
        assertIsGetStatus("kitchen lights", "lights", "kitchen");

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

        assertIsSetValue("set the volume in the living room to 25%");
        assertIsSetValue("change the lights in the kitchen to yellow");
        assertIsSetValue("change the corridor lights to 70%");
        assertIsSetValue("please set the kitchen lights to red");
        assertIsSetValue("set the music volume in the living room at 80%");
        assertIsSetValue("set the lights in the backyard at 80%");
        assertIsSetValue("set the lights of the pool to red");
        assertIsSetValue("set the lights in the child's room to 10%");
        assertIsSetValue("please put the lights in the child's room at 50%");
        assertIsSetValue("change the color the lights in blue");
        assertIsSetValue("set the lights in the living room to 35%");
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

        assertIsGetStatus("montre-moi la température du salon");
        assertIsGetStatus("Température du salon ?");
        assertIsGetStatus("lumières du couloir", "lumières", "couloir");
        assertIsGetStatus("lumières du salon", "lumières", "salon");
        assertIsGetStatus("lumière du salon", "lumière", "salon");
        assertIsGetStatus("lumière de la cuisine", "lumière", "cuisine");
        assertIsGetStatus("lumière de la chambre", "lumière", "chambre");
        assertIsGetStatus("lampes de la chambre", "lampes", "chambre");
        assertIsGetStatus("chauffage du couloir", "chauffage", "couloir");
        assertIsGetStatus("chauffage de la piscine", "chauffage", "piscine");
        assertIsGetStatus("lumières de la terrasse", "lumières", "terrasse");
        assertIsGetStatus("volets de la cuisine", "volets", "cuisine");
        assertIsGetStatus("fenêtre du séjour", "fenêtre", "séjour");
        assertIsGetStatus("lampes du couloir", "lampes", "couloir");
        assertIsGetStatus("chauffage dans la salle de bain", "chauffage", "salle de bain");
        assertIsGetStatus("lumières dans la salle de bain", "lumières", "salle de bain");
        assertIsGetStatus("lumières dans la salle de bain", "lumières", "salle de bain");
        assertIsGetStatus("ventilation dans la salle de bain", "ventilation", "salle de bain");
        assertIsGetStatus("température dans la chambre d'amis", "température", "chambre d amis");
        assertIsGetStatus("lumière dans la salle de jeux", "lumière", "salle de jeux");
        assertIsGetStatus("chauffage dans la buanderie", "chauffage", "buanderie");
        assertIsGetStatus("montre-moi l'état des lumières", "lumières", null);
        assertIsGetStatus("montre-moi l'état du thermostat", "thermostat", null);
        assertIsGetStatus("montre-moi l'état de la consommation électrique", "consommation électrique", null);
        assertIsGetStatus("montre-moi les lampes", "lampes", null);
        assertIsGetStatus("montre-moi le projecteur", "projecteur", null);
        assertIsGetStatus("montre-moi le lecteur dvd", "lecteur dvd", null);
        assertIsGetStatus("montre-moi le chauffage", "chauffage", null);
        assertIsGetStatus("montre-moi un peu le thermostat", "thermostat", null);
        assertIsGetStatus("montre-moi le volet du salon", "volet", "salon");
        assertIsGetStatus("montre-moi la température de la cuisine", "température", "cuisine");
        assertIsGetStatus("peux-tu me montrer le thermostat", "thermostat", null);
        assertIsGetStatus("chauffage au premier étage", "chauffage", "premier étage");
        assertIsGetStatus("chauffage au rez-de-chaussée", "chauffage", "rez de chaussée");
        assertIsGetStatus("lampe de la cage d'escalier", "lampe", "cage d escalier");
        assertIsGetStatus("volet dans la cage d'escalier", "volet", "cage d escalier");
        assertIsGetStatus("arrosage dans le jardin", "arrosage", "jardin");
        assertIsGetStatus("lampes du couloir", "lampes", "couloir");
        assertIsGetStatus("chauffage de la salle de bain", "chauffage", "salle de bain");

        assertIsActivate("active le thermostat dans le garage", "thermostat", "garage");
        assertIsActivate("active le chauffage dans le salon", "chauffage", "salon");
        assertIsActivate("allume la lampe de la cage d'escalier", "lampe", "cage d escalier");
        assertIsActivate("allume la lumière de la chambre", "lumière", "chambre");
        assertIsActivate("allume l'ampli", "ampli", null);
        assertIsActivate("allume la tv s'il te plaît", "tv", null);
        assertIsActivate("mets de la musique", "musique", null);
        assertIsActivate("mets moi de la musique", "musique", null);
        assertIsActivate("mets en route la climatisation", "climatisation", null);
        assertIsActivate("mets de la musique dans le salon", "musique", "salon");
        assertIsActivate("allume la lumière du couloir", "lumière", "couloir");
        assertIsActivate("allume la lumière du salon", "lumière", "salon");
        assertIsActivate("allume les lumières au premier étage", "lumières", "premier étage");
        assertIsActivate("allume le chauffage au rez-de-chaussée", "chauffage", "rez de chaussée");
        // assertIsActivate("mets du chauffage au rez-de-chaussée", "chauffage", "rez de chaussée");

        assertIsDeactivate("arrête le chauffage dans le salon", "chauffage", "salon");
        assertIsDeactivate("stoppe la ventilation", "ventilation", null);
        assertIsDeactivate("éteins les lumières dans la cuisine", "lumières", "cuisine");
        assertIsDeactivate("éteindre la lumière dans la salle à manger", "lumière", "salle à manger");
        assertIsDeactivate("arrêter l'air conditionné", "air conditionné", null);
        assertIsDeactivate("arrête l'arrosage du jardin", "arrosage", "jardin");
        assertIsDeactivate("arrête le volet du salon", "volet", "salon");
        assertIsDeactivate("éteins la lumière du bureau", "lumière", "bureau");
        assertIsDeactivate("stoppe la ventilation", "ventilation", null);
        assertIsDeactivate("stoppe la chaudière", "chaudière", null);
        assertIsDeactivate("je ne veux plus de chauffage dans le salon", "chauffage", "salon");
        assertIsDeactivate("arrête la musique", "musique", null);
        assertIsDeactivate("je ne veux plus de musique", "musique", null);

        assertIs(Skills.GET_HISTORY_HOURLY,
                "donne-moi un graphique de la température du salon pour les dernières heures");
        checkInterpretation(Skills.GET_HISTORY_DAILY, "température dans la salle de bain sur 3 jours", "température",
                "salle de bain");
        assertIs(Skills.GET_HISTORY_MONTHLY, "graphique mensuel de la température sur 2 mois");
        assertIs(Skills.GET_HISTORY_WEEKLY, "graphique de la température de la semaine");

        assertIsSetValue("mets la température du salon à 23");
        assertIsSetValue("mets le volume de la musique à 50 %");
        assertIsSetValue("mets le volume à 50 %");
        assertIsSetValue("change la lumière au rez-de-chaussée à 12%");
        assertIsSetValue("couleur rouge pour le bureau");
        assertIsSetValue("mets les lumières de la terrasse en jaune");
        assertIsSetValue("mets les lampes du balcon en orange");
        assertIsSetValue("mets la ventilation à 40 %");
        assertIsSetValue("change la couleur de la cuisine en bleu");
        assertIsSetValue("mets la musique à 40");
        assertIsSetValue("mets la musique dans la cuisine à 80");
        assertIsSetValue("mets les lumières dans le jardin en violet");
        assertIsSetValue("mets les lumières dans la buanderie à 40%");
        assertIsSetValue("mets les lumières dans le couloir à 20%");
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
