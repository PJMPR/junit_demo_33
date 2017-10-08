package junitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test_Addition_In_Calculator_Class() {
		
		Calculator calculator = new Calculator();
		
		int five = calculator.add(2,3);
		int seven = calculator.add(3, 4);

		assertEquals("Should properly add two numbers.", 5, five);
		assertEquals("Should properly add two numbers.", 7, seven);
		
		
	}

}
