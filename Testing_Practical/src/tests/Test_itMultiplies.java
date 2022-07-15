package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_itMultiplies {
	Calculator c = new Calculator();
	@Test
	public void test_itMultipliesPostive() {
		assertEquals(1, c.multiply("1", "1"), 0.01);
	}
	@Test
	public void test_itMultipliesNegative() {
		assertEquals(-1, c.multiply("1", "-1"), 0.01);
	}
	@Test
	public void test_itMultiplesNull() {
		assertEquals(0, c.multiply("1", "0"), 0.01);
	}
	public void test_itFloats() {
		if(c.multiply("0.33333334", "3") >= 0.99 && c.multiply("0.33333334", "3") <= 1);
		else fail("Not yet implemented");
	}
}
