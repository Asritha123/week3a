package week3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals(8,c.add(3,5));
	}

	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertEquals(-2,c.sub(3, 5));
	}
	@Test
	public void testMul() {
		Calculator c=new Calculator();
		assertEquals(15,c.mul(3,5));
	}
	@Test
	public void testDiv() {
		Calculator c=new Calculator();
		assertEquals(0,c.div(3, 5));
	}
}
