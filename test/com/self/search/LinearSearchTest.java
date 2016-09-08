package com.self.search;

import org.junit.Assert;
import org.junit.Test;
import src.com.self.search.LinearSearch;

public class LinearSearchTest {

    @Test
    public void searchNumberSuccessTest() {
        int [] inputArray = {2, 3, 5, 8, 15, 34, 23, 54, 11, 45, -90, -2, -53};
        int searchNumber = 34;

        LinearSearch inputLinearSearchObject = new LinearSearch();
        int searchedIndex = inputLinearSearchObject.searchIndex(inputArray, searchNumber);

        Assert.assertNotNull(searchedIndex);
        Assert.assertEquals(5, searchedIndex);
    }

    @Test
    public void searchNumberNegativeTest() {
        int [] inputArray = {2, 3, 5, 8, 15, 34, 23, 54, 11, 45, -90, -2, -53};
        int searchNumber = 87;

        LinearSearch inputLinearSearchObject = new LinearSearch();
        int searchedIndex = inputLinearSearchObject.searchIndex(inputArray, searchNumber);

        Assert.assertNotNull(searchedIndex);
        Assert.assertEquals(-1, searchedIndex);
    }
}