package org.openhab.ui.habot.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openhab.ui.habot.nlp.AlphaNumericTokenizer;

public class TokenizerTest {

    private void printTokens(String[] tokens) {
        System.out.println(String.join(" ", tokens));
    }

    @Test
    public void testTokenizer() {
    	String[] actual;
    	AlphaNumericTokenizer tokenizer = AlphaNumericTokenizer.INSTANCE;

        actual = tokenizer.tokenize("show me the temperature in the kitchen please!");
        printTokens(actual);
        assertEquals(8, actual.length);
        
        actual = tokenizer.tokenize("what's the temperature in the kitchen please?");
        printTokens(actual);
        assertEquals(8, actual.length);
                
        actual = tokenizer.tokenize("I'd like to know the temperature in the ground-floor. Can you do that?");      
        printTokens(actual);
        assertEquals(15, actual.length);
        assertEquals("d", actual[1]);
        assertEquals("that", actual[14]);
        
        actual = tokenizer.tokenize("Ich möchte die Temperatur im Wohnzimmer wissen. Weißt du die?");      
        printTokens(actual);
        assertEquals(10, actual.length);
        assertEquals("möchte", actual[1]);
        assertEquals("die", actual[9]);        
    }

}
