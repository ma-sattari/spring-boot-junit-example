package com.masoud.junitexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = null;

    @BeforeEach
    public void init (){
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(10,calculator.add(4,6));
        assertEquals(4,calculator.add(-2,6));
        assertEquals(2,calculator.add(0,2));
    }
}