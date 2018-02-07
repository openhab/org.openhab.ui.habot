package org.openhab.ui.habot.test;

import org.junit.Test;
import org.openhab.ui.habot.nlp.AlphaNumericTokenizer;

public class TokenizerTest {

    private void printTokens(String[] tokens) {
        System.out.println(String.join(" ", tokens));
    }

    @Test
    public void testTokenizer() {
        AlphaNumericTokenizer tokenizer = AlphaNumericTokenizer.INSTANCE;

        printTokens(tokenizer.tokenize("show me the temperature in the kitchen please!"));
        printTokens(tokenizer.tokenize("what's the temperature in the kitchen please?"));
        printTokens(tokenizer.tokenize("I'd like to know the temperature in the ground-floor. Can you do that?"));
    }

}
