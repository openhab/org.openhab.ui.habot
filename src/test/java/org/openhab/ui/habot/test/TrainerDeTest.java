package org.openhab.ui.habot.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openhab.ui.habot.nlp.Intent;
import org.openhab.ui.habot.nlp.internal.IntentTrainer;

public class TrainerDeTest extends AbstractTrainerTest {


	@Test
	public void testActivateObjects() throws Exception {

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
	public void testDeactivateObjects() throws Exception {

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
	public void testGetStatus() throws Exception {

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
	public void testHistoryHourly() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

		actual = interpret("wie ist der Verlauf der Temperatur der letzten Stunde?");
		assertEquals(Skills.GET_HISTORY_HOURLY, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));

		actual = interpret("Verlauf der Temperatur der letzten Stunde");
		assertEquals(Skills.GET_HISTORY_HOURLY, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));
	}

	@Test
	public void testHistoryDaily() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

		actual = interpret("Verlauf der Temperatur der letzten 24 Stunden");
		assertEquals(Skills.GET_HISTORY_DAILY, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));

		actual = interpret("Verlauf der Luftfeuchtigkeit der letzten 24 Stunden");
		assertEquals(Skills.GET_HISTORY_DAILY, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("luftfeuchtigkeit", actual.getEntities().get("object"));

	}

	@Test
	public void testHistoryWeekly() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

		actual = interpret("Verlauf der Temperatur der letzten Woche");
		assertEquals(Skills.GET_HISTORY_WEEKLY, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));

		actual = interpret("Verlauf der Luftfeuchtigkeit der letzten Woche");
		assertEquals(Skills.GET_HISTORY_WEEKLY, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("luftfeuchtigkeit", actual.getEntities().get("object"));

		actual = interpret("zeige die Wochenübersicht der Temperatur für die Küche");
		assertEquals(Skills.GET_HISTORY_WEEKLY, actual.getName());
		assertEquals(2, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));
		assertEquals("küche", actual.getEntities().get("location"));
	}

	@Test
	public void testHistoryMonthly() throws Exception {

		Intent actual;
		this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

		actual = interpret("Verlauf der Temperatur des letzten Monats");
		assertEquals(Skills.GET_HISTORY_MONTHLY, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));

		actual = interpret("Verlauf der Luftfeuchtigkeit des letzten Monats");
		assertEquals(Skills.GET_HISTORY_MONTHLY, actual.getName());
		assertEquals(1, actual.getEntities().size());
		assertEquals("luftfeuchtigkeit", actual.getEntities().get("object"));

		actual = interpret("Monatsübersicht der Temperatur für die Küche");
		assertEquals(Skills.GET_HISTORY_MONTHLY, actual.getName());
		assertEquals(2, actual.getEntities().size());
		assertEquals("temperatur", actual.getEntities().get("object"));
		assertEquals("küche", actual.getEntities().get("location"));
	}

    @Test
    public void testHistoryLastChanges() throws Exception {

        Intent actual;
        this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");

        actual = interpret("wann hat sich die Temperatur das letzte mal geändert?");
        assertEquals(Skills.GET_HISTORY_LAST_CHANGES, actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("temperatur", actual.getEntities().get("object"));
        
        actual = interpret("wann wurde der letzte Alarm ausgelöst?");
        assertEquals(Skills.GET_HISTORY_LAST_CHANGES, actual.getName());
        assertEquals(1, actual.getEntities().size());
        assertEquals("alarm", actual.getEntities().get("object"));        
              
        actual = interpret("wann wurde der Status vom Licht im Wohnzimmer zuletzt geändert?");
        assertEquals(Skills.GET_HISTORY_LAST_CHANGES, actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("wohnzimmer", actual.getEntities().get("location"));
        assertEquals("licht", actual.getEntities().get("object"));
    } 
    
    @Test
    public void testSetValue() throws Exception {
        Intent actual;
        this.trainer = new IntentTrainer("de", skills, null, "alphanumeric");
        
        actual = interpret("stell den Thermostat auf 21 Grad.");
        assertEquals(Skills.SET_VALUE, actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("thermostat", actual.getEntities().get("object"));
        assertEquals("21", actual.getEntities().get("value"));
        
        actual = interpret("Temperatur auf 21 Grad erhöhen.");
        assertEquals(Skills.SET_VALUE, actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("temperatur", actual.getEntities().get("object"));
        assertEquals("21", actual.getEntities().get("value")); 
        
        actual = interpret("Dimme das Licht auf 70%");
        assertEquals(Skills.SET_VALUE, actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("licht", actual.getEntities().get("object"));
        assertEquals("70", actual.getEntities().get("value"));  
        
        actual = interpret("Dimme das Licht im Wohnzimmer auf 70%");
        assertEquals(Skills.SET_VALUE, actual.getName());
        assertEquals(3, actual.getEntities().size());
        assertEquals("licht", actual.getEntities().get("object"));
        assertEquals("wohnzimmer", actual.getEntities().get("location"));
        assertEquals("70", actual.getEntities().get("value")); 
        
        actual = interpret("Regle im Wohnzimmer die Lautstärke auf 50");
        assertEquals(Skills.SET_VALUE, actual.getName());
        assertEquals(3, actual.getEntities().size());
        assertEquals("lautstärke", actual.getEntities().get("object"));
        assertEquals("wohnzimmer", actual.getEntities().get("location"));
        assertEquals("50", actual.getEntities().get("value")); 
 

        actual = interpret("Färbe das Licht grün");
        assertEquals(Skills.SET_VALUE, actual.getName());
        assertEquals(2, actual.getEntities().size());
        assertEquals("licht", actual.getEntities().get("object"));
        assertEquals("grün", actual.getEntities().get("value"));  
     
    }
}
