package edu.coldserenity.tij.ch01.ex05;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;


public class DataOnlyTest {

    public static final String EXPECTED =
            "data.i = 47\n" +
            "data.d = 1.1\n" +
            "data.b = false\n";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMain() throws Exception {
        DataOnly.main(new String[]{});
        assertEquals(EXPECTED, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
