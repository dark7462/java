package test;

import org.junit.jupiter.api.Test;
import testing_classes.reverseString;

import static org.junit.jupiter.api.Assertions.*;

class reverseStringTest {

    @Test
    void reverse() {
        var t = new reverseString();
        String given = "Anurag";
        String expected = "garunA";
//        System.out.println(t.reverse(given));
        assertEquals(expected,t.reverse(given));
    }
}