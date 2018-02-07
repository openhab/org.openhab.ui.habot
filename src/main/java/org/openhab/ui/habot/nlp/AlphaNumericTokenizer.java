package org.openhab.ui.habot.nlp;

import java.util.Arrays;
import java.util.stream.Stream;

import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.Span;

public class AlphaNumericTokenizer extends SimpleTokenizer {

    public static final AlphaNumericTokenizer INSTANCE;

    static {
        INSTANCE = new AlphaNumericTokenizer();
    }

    /**
     * @deprecated Use INSTANCE field instead to obtain an instance, constructor
     *             will be made private in the future.
     */
    @Deprecated
    public AlphaNumericTokenizer() {
    }

    @Override
    public Span[] tokenizePos(String s) {
        Span[] tokens = super.tokenizePos(s);
        Stream<Span> filteredTokens = Arrays.stream(tokens)
                .filter(span -> Character.isLetter(span.getCoveredText(s).charAt(0))
                        || Character.isDigit(span.getCoveredText(s).charAt(0)));

        return filteredTokens.toArray(Span[]::new);
    }

}
