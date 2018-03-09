package org.openhab.ui.habot.test;

import org.junit.Test;
import org.openhab.ui.habot.nlp.internal.natty.DateGroup;
import org.openhab.ui.habot.nlp.internal.natty.Parser;
import org.openhab.ui.habot.nlp.internal.natty.ParserFR;

public class NattyTest {

    @Test
    public void test() {
        Parser parser = new Parser();
        DateGroup dateGroup = parser.parse("tomorrow at 3 pm").get(0);
        System.out.println(dateGroup.getDates());
        System.out.println("Recurring: " + dateGroup.isRecurring());
    }

    @Test
    public void testFR() {
        ParserFR parserFR = new ParserFR();
        DateGroup dateGroup = parserFR.parse("ce soir 22h").get(0);
        System.out.println(dateGroup.getDates());
        System.out.println("Recurring: " + dateGroup.isRecurring());
    }

}
