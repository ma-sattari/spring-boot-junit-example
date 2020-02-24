package com.masoud.junitexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        MathUtils mathUtils = new MathUtils();

        assertEquals(10,mathUtils.add(6,4));
//        System.out.println("this test ran");
    }
}