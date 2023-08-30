package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Calculator;

class CalculatorTest {
	
	Calculator calculate = new Calculator();

	@BeforeEach
	void setUp() throws Exception {
		// Not implemented
	}

	@AfterEach
	void tearDown() throws Exception {
		// Not implemented
	}

	@Test
	public void sumTest() {
		assertEquals(3, calculate.sum(2,1));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(1, calculate.subtract(2,1));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(4, calculate.multiply(2,2));
	}
	
	@Test
	public void divideTest() {
		assertEquals(4, calculate.divide(2,2));
	}
	

}
