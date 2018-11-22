package com.dmodi;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyTests {
	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		MyClass tester = new MyClass(); //MyClass is tested

		//assert statements
		assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
		assertEquals("10 x 10 must be 100", 100, tester.multiply(10, 10));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		MyClass tester = new MyClass();
		tester.multiply(5, 1000);
	}
}