import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	// here we write the test methods (test cases) for the methods of Calculator class
	
	@Test
	public void testAddPositive() {
		int number1 = 20;
		int number2 = 40;
		
		int expectedOutput = 60;
		
		Calculator calculator = new Calculator();
		int actualOutput = calculator.add(number1, number2);
		
		// we should check if excpected output and the actual output are the same
		// if they are same the test passes
		// else the test fails
		// we use assertions for this
		assertEquals(expectedOutput, actualOutput);
		
		
	}
	
	@Test
	public void testAddNegative() {
		int number1 = -12;
		int number2 = -15;
		
		int expectedOutput = -27;
		
		Calculator calculator = new Calculator();
		int actualOutput = calculator.add(number1, number2);
		
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void testAddZero() {
		int number1 = 0;
		int number2 = 0;
		
		int expectedOutput = 0;
		
		Calculator calculator = new Calculator();
		int actualOutput = calculator.add(number1, number2);
		
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void testMultiplyPositive() {
		int number1 = 20;
		int number2 = 40;
		
		int expectedOutput = 800;
		
		Calculator calculator = new Calculator();
		int actualOutput = calculator.multiply(number1, number2);
		
		// we should check if excpected output and the actual output are the same
		// if they are same the test passes
		// else the test fails
		// we use assertions for this
		assertEquals(expectedOutput, actualOutput);
		
		
	}
	
	@Test
	public void testMultiplyNegative() {
		int number1 = -10;
		int number2 = -15;
		
		int expectedOutput = 150;
		
		Calculator calculator = new Calculator();
		int actualOutput = calculator.multiply(number1, number2);
		
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void testMultiplyZero() {
		int number1 = 0;
		int number2 = 0;
		
		int expectedOutput = 0;
		
		Calculator calculator = new Calculator();
		int actualOutput = calculator.multiply(number1, number2);
		
		assertEquals(expectedOutput, actualOutput);
		
	}
}
