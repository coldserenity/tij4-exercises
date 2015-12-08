package edu.coldserenity.tij.ch01.ex02;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMain() throws Exception {
        HelloWorld.main(new String[]{});
        assertEquals("Hello World!\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
