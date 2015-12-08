package edu.coldserenity.tij.ch01.ex03;

import org.junit.Assert;
import org.junit.Test;

public class ATypeNameTest {

    @Test
    public void testMain() {
        ATypeName.main(new String[]{});
        Assert.assertTrue("Method worked well", true);
    }
}
