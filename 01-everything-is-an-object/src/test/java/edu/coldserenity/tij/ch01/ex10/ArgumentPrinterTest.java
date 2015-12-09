package edu.coldserenity.tij.ch01.ex10;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class ArgumentPrinterTest {

    public static final String EXPECTED =
            "{args[0]=\"sdj\", args[1]=\"2\", args[2]=\"f;glk\"}\n";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMain() throws Exception {
        ArgumentPrinter.main(new String[]{"sdj", "2", "f;glk"});
        assertEquals(EXPECTED, systemOutRule.getLogWithNormalizedLineSeparator());
    }}