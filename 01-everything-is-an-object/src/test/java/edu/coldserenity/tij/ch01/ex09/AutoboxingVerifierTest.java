package edu.coldserenity.tij.ch01.ex09;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AutoboxingVerifierTest {

    @Test
    public void testMain() throws Exception {
        AutoboxingVerifier.main(new String[]{});
        Assert.assertTrue("Method worked well", true);
    }
}