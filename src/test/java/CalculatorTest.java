package com.palo.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class CalculatorTests {

    private Calculator calculator =  new Calculator();

	@Test
	public void testSum() {
        assertEquals(5,calculator.sum(2,3));
	}

}