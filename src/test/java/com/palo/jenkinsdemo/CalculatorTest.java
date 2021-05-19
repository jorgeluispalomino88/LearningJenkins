package com.palo.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTest {

    private Calculator calculator;

    CalculatorTest(){
       calculator = new Calculator();
    }

    //Test created with TDD: Create Test Fail, Make Test Pass, Refactor Code
    @Test
    void Sum() {
        int a = 3;
        int b = 2;

        assertEquals(5, calculator.Sum(a, b));

    }
}
