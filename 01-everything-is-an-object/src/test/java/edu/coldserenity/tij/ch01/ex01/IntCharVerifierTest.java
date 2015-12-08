package edu.coldserenity.tij.ch01.ex01;


import org.testng.Assert;
import org.testng.annotations.Test;

public class IntCharVerifierTest {
    @Test
    public void testUninitializedValues() {
        IntCharVerifier icv = new IntCharVerifier();

        Assert.assertEquals(icv.i, 0);
        Assert.assertEquals(icv.c, 0);
    }
}
