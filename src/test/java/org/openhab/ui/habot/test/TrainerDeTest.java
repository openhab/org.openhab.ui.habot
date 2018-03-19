package org.openhab.ui.habot.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.internal.IntentTrainer;

public class TrainerDeTest extends AbstractTrainerTest {


	@Test
	public void testDE_activateObjects() throws Exception {

		Intent actual;
        this.trainer = new IntentTrainer("de", skills);

		actual = interpret("mach den Fernseher an");
		assertEquals(Skills.ACTIVATE_OBJECT, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("fernseher", actual.getEntities().get("object"));

		actual = interpret("bitte mache das Licht an");
		assertEquals(Skills.ACTIVATE_OBJECT, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("licht", actual.getEntities().get("object"));
	}

	@Test
	public void testDE_deactivateObjects() throws Exception {

		Intent actual;
        this.trainer = new IntentTrainer("de", skills);

		actual = interpret("Licht aus");
		assertEquals(Skills.DEACTIVATE_OBJECT, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("licht", actual.getEntities().get("object"));

		actual = interpret("mach den Fernseher aus");
		assertEquals(Skills.DEACTIVATE_OBJECT, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("fernseher", actual.getEntities().get("object"));

		actual = interpret("bitte mache das Licht aus");
		assertEquals(Skills.DEACTIVATE_OBJECT, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("licht", actual.getEntities().get("object"));
	}

	@Test
	public void testDE_getStatus() throws Exception {

		Intent actual;
        this.trainer = new IntentTrainer("de", skills);

		actual = interpret("Heizung in der Küche");
		assertEquals(Skills.GET_STATUS, actual.getName());
		assertEquals(2, actual.getEntities().size());
		assertEquals("heizung", actual.getEntities().get("object"));
		assertEquals("küche", actual.getEntities().get("location"));

		actual = interpret("wie hoch ist die Temperatur im Wohnzimmer");
		assertEquals(Skills.GET_STATUS, actual.getName());
		assertEquals(2, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));
		assertEquals("wohnzimmer", actual.getEntities().get("location"));

		actual = interpret("wie hoch ist die Temperatur im Keller");
		assertEquals(Skills.GET_STATUS, actual.getName());
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
