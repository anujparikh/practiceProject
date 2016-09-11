package com.self.projecteuler;

import org.junit.Assert;
import org.junit.Test;
import src.com.self.projecteuler.Problem7;

public class Problem7Test {

    @Test
    public void findNthPrimeTest() {
        Problem7 inputObj = new Problem7();
        Integer methodOutput = inputObj.findNthPrimeNumber(100);
        Assert.assertEquals((Integer) 541, methodOutput);
        Assert.assertEquals((Integer) 104743, inputObj.findNthPrimeNumber(10001));
    }
}
