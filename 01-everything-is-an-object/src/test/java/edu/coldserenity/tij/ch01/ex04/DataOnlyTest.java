package edu.coldserenity.tij.ch01.ex04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataOnlyTest {

    @Test
    public void testMain() throws Exception {
        DataOnly.main(new String [] {});
        Assert.assertTrue("Method worked well", true);
    }
}