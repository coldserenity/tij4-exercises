package edu.coldserenity.tij.ch02.ex01;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class PrintUserTest {

    public static final String EXPECTED = "This is a simple print\n" +
            "This is a standard print\n";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMain() throws Exception {
        PrintUser.main(new String[]{});
        assertEquals(EXPECTED, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
