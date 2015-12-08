package edu.coldserenity.tij.ch01.ex06;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class StorageCallTest {

    public static final String EXPECTED = "[Test string] requires [22] bytes of storage\n";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMain() throws Exception {
        StorageCall.main(new String[]{});
        assertEquals(EXPECTED, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}