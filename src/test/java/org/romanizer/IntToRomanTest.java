package org.romanizer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class IntToRomanTest {

    IntToRoman classUnderTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        classUnderTest = new IntToRoman();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void intToRoman() {
    }


    @Test
    public void test1() {
        //List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 50, 90, 100, 400, 900, 1000);

        List<Integer> integerList = Arrays.asList(14, 15, 16);
        List<String> actual = classUnderTest.intToRoman(integerList);
        List<String> expected=Arrays.asList("XIV", "XV", "XVI");

        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> actual = classUnderTest.intToRoman(integerList);
        List<String> expected=Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        List<Integer> integerList = Arrays.asList(40, 50, 90, 100, 400,500, 900, 1000);
        List<String> actual = classUnderTest.intToRoman(integerList);
        List<String> expected=Arrays.asList("XL", "L", "XC", "C", "CD", "D", "CM", "M");

        assertEquals(expected, actual);
    }

}