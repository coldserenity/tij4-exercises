package edu.coldserenity.tij.ch01.ex07;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class IncrementableTest {

    public static final String EXPECTED =
            "Initial value [47]\n" +
                    "After sf.increment(): [48]\n" +
                    "After Incrementable.increment(): [49]\n";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMain() throws Exception {
        Incrementable.main(new String[]{});
        assertEquals(EXPECTED, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}