package com.self.datastructures;

import org.junit.Assert;
import org.junit.Test;
import src.com.self.datastructures.SinglyLinkedList;

public class SinglyLinkedListTest {

    @Test
    public void singlyLinkedListAddFirstTest() {
        SinglyLinkedList<Integer> testInput = new SinglyLinkedList<>();
        testInput.addFirst(1);
        testInput.addFirst(2);
        Assert.assertEquals((Integer) 1, (Integer) testInput.getTail().getElement());
        Assert.assertEquals((Integer) 2, (Integer) testInput.getHead().getElement());
    }
}
