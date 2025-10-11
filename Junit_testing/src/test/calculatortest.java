package test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import testing_classes.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    @BeforeAll // With this Annotation the method will execute at starting before all test case
    static void beforeTest(){
        System.out.println("Before all the test");
    }
    @AfterAll // With this Annotation the method will execute at starting After all test case
    static void AfterTest(){
        System.out.println("After all the test");
    }
    @BeforeEach // With this Annotation the method will execute at starting before every test case
    void BeforeEachTest(){
        System.out.println("Before each test");
    }
    calculator cal = new calculator();
    @Test
    void addTest(){
        assertEquals(4,cal.add(2,2));
        System.out.println("Test 1 : passed");
    }
    @Test
    void addTest2(){
        assertEquals(6,cal.add(3,3));
        System.out.println("Test 2 : passed");
    }
    @Test
    void failingTest(){
        assertEquals(7,cal.add(3,4),"Test Failed Check cal.add()");
        System.out.println("Test 3 : passed");
    }
//    @Test
    void failingTest2(){ // both will give the same output when failed but the lambda function is a better way to do it because
        assertEquals(10,cal.add(3,4),()->"Test Failed Check cal.add()");
        // if we use lambda function (supplier functional Interface) the string will not be evaluated
        System.out.println("Test 4 : passed");
    } // if the test case fails it'll give a yellow mark in some IDEs

    @Test
    void fail(){
        assertFalse(false); // will pass when the test fails
        assertTrue(true); // will pass when the test is pass
        System.out.println("Test 5 : passed");
    }
    @Test
    void arrayTest(){
        int []expected = {10,20,30,40};
        int []actual = {10,20,30,40};
        assertArrayEquals(expected,actual,()->"Failed check array" );
        System.out.println("Test 6 : passed");
        // expected then the actual value
        // Array and elements should be equal
    }
    @Test
    void arrayTest2(){
        int []arr = new int[5];
        for(int i = 0 ; i < 5; i++) arr[i] = i+1;
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        System.out.println("Test 7 : passed");
    }
}
