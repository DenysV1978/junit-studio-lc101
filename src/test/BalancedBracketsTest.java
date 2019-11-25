package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_Class;

    @Before

    public void createNewTestObject() {
        test_Class = new BalancedBrackets();
    }

    //TODO: add tests here

    //this test basically test application and set up itself. The idea is to make sure it works well before
    // you start running tests for the tested code
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        //BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithCharsInBetweenBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[ggg]"));
    }
    @Test
    public void bracketsWithCharsBeforeThemReturndTrue() {
        assertTrue(test_Class.hasBalancedBrackets("fff[]"));
    }
    @Test
    public void notBalancedBracketsReturnFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[["));
    }
    @Test
    public void oneBalancedAndOneUnbalancedReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[]]"));
    }
    @Test
    public void noBracketsReturnFalse() {
        assertFalse(test_Class.hasBalancedBrackets("fff"));
    }
    @Test
    public void nothingReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets(""));
    }
    @Test
    public void numbersWithBalancedBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("444[]"));
    }
//    @Test(expected = IllegalArgumentException.class)
//    public void integerReturnsError() {
//        test_Class.hasBalancedBrackets(666);
//        fail("String value should be input");
//    }

    @Test
    public void specificStringFromCodeDescriptionReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testRetrunsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("][]"));
    }

    @Test
    public void testReturnsFales2() {
        assertFalse(test_Class.hasBalancedBrackets("[]][[]"));
    }


}