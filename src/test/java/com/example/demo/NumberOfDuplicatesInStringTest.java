package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDuplicatesInStringTest {

    NumberOfDuplicatesInString numberOfDuplicatesInString = new NumberOfDuplicatesInString();

    @Test
    public void test(){
        assertEquals(3,numberOfDuplicatesInString.numberOfDuplicates("aabab"));
    }
}
