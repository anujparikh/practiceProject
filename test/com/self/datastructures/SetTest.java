package com.self.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.com.self.datastructures.Set;

public class SetTest {

    public class TestClass {
        private Integer field1;
        private Integer field2;
        private String strField;

        public TestClass(Integer field1, Integer field2, String strField) {
            this.field1 = field1;
            this.field2 = field2;
            this.strField = strField;
        }

        public Integer getField1() {
            return field1;
        }

        public Integer getField2() {
            return field2;
        }

        public String getStrField() {
            return strField;
        }
    }

    private Set<Integer> testInputIntegerSet;
    private Set<String> testInputStringSet;
    private Set<TestClass> testInputTestClassSet;

    @Before
    public void setup() {
        testInputIntegerSet = new Set<>();
        testInputStringSet = new Set<>();
        testInputTestClassSet = new Set<>();
    }

    @Test
    public void setAddTestClassSuccessTest() {
        Boolean outputResult = testInputTestClassSet.add(new TestClass(1, 2, "testField"));
        TestClass receivedOutput = testInputTestClassSet.get(0);
        Assert.assertEquals((Integer) 1, receivedOutput.getField1());
        Assert.assertTrue(outputResult);
    }

    @Test
    public void setAddIntegerSuccessTest() {
        Boolean outputResult = testInputIntegerSet.add(1);
        Assert.assertTrue(outputResult);
    }

    @Test
    public void setAddDuplicateIntegerFailureTest() {
        testInputIntegerSet.add(1);
        Assert.assertFalse(testInputIntegerSet.add(1));
    }

    @Test
    public void setGetIntegerSuccessTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        Integer output = testInputIntegerSet.get(1);
        Assert.assertEquals((Integer) 2, output);
    }

    @Test
    public void setGetStringSuccessTest() {
        testInputStringSet.addAll(new String[]{"Anuj", "Palak", "Parikh"});
        String output = testInputStringSet.get(1);
        Assert.assertEquals("Palak", output);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void setGetStringFailureTest() {
        testInputStringSet.addAll(new String[]{"Anuj", "Palak", "Parikh"});
        String output = testInputStringSet.get(5);
    }

    @Test
    public void setAddStringSuccessTest() {
        Assert.assertTrue(testInputStringSet.add("Anuj"));
    }

    @Test
    public void setAddDuplicationStringFailureTest() {
        Assert.assertTrue(testInputStringSet.add("Anuj"));
        Assert.assertTrue(testInputStringSet.add("Palak"));
        Assert.assertFalse(testInputStringSet.add("Anuj"));
    }

    @Test
    public void setAddAllIntegerTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        // TODO: Asserting once get method is in place
    }

    @Test
    public void setAddAllWithDuplicateIntegerTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 3, 4, 4, 5, 6, 7});
        // TODO: Asserting once get method is in place
    }

    @Test
    public void setAddAllStringTest() {
        testInputStringSet.addAll(new String[]{"Anuj", "Palak", "Hardik", "Anju"});
        // TODO: Asserting once get method is in place
    }

    @Test
    public void setAddAllWithDuplicateStringTest() {
        testInputStringSet.addAll(new String[]{"Anuj", "Palak", "Hardik", "Anju", "Anuj", "Palak"});
        // TODO: Asserting once get method is in place
    }

    @Test
    public void setContainsIntegerSuccessTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertTrue(testInputIntegerSet.contains(2));
    }

    @Test
    public void setContainsStringSuccessTest() {
        testInputStringSet.addAll(new String[]{"Anuj", "Palak", "Hardik"});
        Assert.assertTrue(testInputStringSet.contains("Palak"));
    }

    @Test
    public void setContainsIntegerFailureTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertFalse(testInputIntegerSet.contains(22));
    }

    @Test
    public void setContainsStringFailureTest() {
        testInputStringSet.addAll(new String[]{"Anuj", "Palak", "Hardik"});
        Assert.assertFalse(testInputStringSet.contains("Anju"));
    }

    @Test
    public void setContainsAllIntegerSuccessTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertTrue(testInputIntegerSet.containsAll(new Integer[]{1, 2, 3, 4}));
    }

    @Test
    public void setContainsAllIntegerFailureTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertFalse(testInputIntegerSet.containsAll(new Integer[]{1, 2, 3, 4, 8}));
    }

    @Test
    public void setContainsAllStringSuccessTest() {
        testInputStringSet.addAll(new String[]{"Anuj", "Palak", "Hardik"});
        Assert.assertTrue(testInputStringSet.containsAll(new String[]{"Anuj", "Palak"}));
    }

    @Test
    public void setContainsAllStringFailureTest() {
        testInputStringSet.addAll(new String[]{"Anuj", "Palak", "Hardik"});
        Assert.assertFalse(testInputStringSet.containsAll(new String[] {"Anuj", "Anju"}));
    }

    @Test
    public void setIsEmptySuccessTest() {
        Assert.assertTrue(testInputIntegerSet.isEmpty());
    }

    @Test
    public void setIsEmptyFailureTest() {
        testInputIntegerSet.add(1);
        Assert.assertFalse(testInputIntegerSet.isEmpty());
    }

    @Test
    public void setClearSuccessTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        testInputIntegerSet.clear();
        Assert.assertTrue(testInputIntegerSet.isEmpty());
    }

    @Test
    public void setRemoveSuccessTest() {
        testInputIntegerSet.addAll(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        testInputIntegerSet.remove(5);
        Assert.assertFalse(testInputIntegerSet.contains(5));
    }
}