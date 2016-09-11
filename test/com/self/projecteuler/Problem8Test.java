package com.self.projecteuler;

import org.junit.Assert;
import org.junit.Test;
import src.com.self.projecteuler.Problem8;

/**
 * Created by anujparikh on 9/11/16.
 */
public class Problem8Test {

    @Test
    public void adjacentGreatestProductTest() {
        Problem8 testObject = new Problem8();
        Assert.assertEquals((Long) 23514624000L, (Long) testObject.adjacentGreatestProduct());
    }
}
