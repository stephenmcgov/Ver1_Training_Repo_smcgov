package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_itDivides {
	Calculator c = new Calculator();
	@Test
	public void test_itDividesPostive() {
		assertEquals(1, c.divide("1", "1") , 0.01);
	}
	@Test
	public void test_itDividesNegative() {
		assertEquals(-1, c.divide("1", "-1"), 0.01);
	}
	@Test
	public void test_itFloats() {
		if(c.divide("1", "3") >= 0.33333333 && c.divide("1", "3") <= 0.33333335);
		else fail("Not yet implemented");
	}
	/*@Test
	void test_itDividesNull() {
		System.out.println(c.divide("1", "0"));
		if(c.divide("1", "0") == 0);
		else fail("Not yet implemented");
	}*/
}
