package com.self.projecteuler;

import org.junit.Assert;
import org.junit.Test;
import src.com.self.projecteuler.Problem6;

public class Problem6Test {

    @Test
    public void sumOfSquareTest() {
        Problem6 testObject = new Problem6();
        Integer methodOutput = testObject.sumOfSquares(10);
        Assert.assertEquals((Integer) 385, methodOutput);
    }

    @Test
    public void squareOfSumTest() {
        Problem6 testObject = new Problem6();
        Integer methodOutput = testObject.squareOfSum(10);
        Assert.assertEquals((Integer) 3025, methodOutput);
    }

    @Test
    public void differenceTest() {
        Problem6 testObject = new Problem6();
        Integer methodOutput = testObject.difference(100);
        Assert.assertEquals((Integer) 25164150, methodOutput);
    }
}
