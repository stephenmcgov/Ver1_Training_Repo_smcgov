package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_itAdds {
	@Before
	public Calculator init() {
		Calculator i = new Calculator();
		return i;
	}
	
	@Test
	public void test_itAddsPostive() {
		Calculator c = init();
		assertEquals(1, c.add("0", "1"), 0.01);
	}
	@Test
	public void test_itAddsNegative() {
		Calculator c = init();
		assertEquals(-1, c.add("0", "-1"), 0.01);
	}
	@Test
	public void test_itAddsNull() {
		Calculator c = init();
		assertEquals(1, c.add("1", "0"), 0.01);
	}
	public void test_itFloats() {
		Calculator c = init();
		if(c.add("0", "0.33333334") >= 0.33333333 && c.add("1", "3") <= 0.33333335);
		else fail("Not yet implemented");
	}
}
