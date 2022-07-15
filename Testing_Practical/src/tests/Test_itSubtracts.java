package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_itSubtracts {
	Calculator c = new Calculator();
	@Test
	public void test_itSubtractsPostive() {
		assertEquals(-1, c.subtract("0", "1"), 0.01);
	}
	@Test
	public void test_itSubtractsNegative() {
		assertEquals(1, c.subtract("0", "-1"), 0.01);
	}
	@Test
	public void test_itASubtractsNull() {
		assertEquals(1, c.subtract("1", "0"), 0.01);
	}
	public void test_itFloats() {
		if(c.subtract("0", "0.33333334") >= -0.33333333 && c.subtract("1", "3") <= -0.33333335);
		else fail("Not yet implemented");
	}
}
