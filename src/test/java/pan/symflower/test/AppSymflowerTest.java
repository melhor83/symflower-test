package pan.symflower.test;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.*;
import static org.junit.Assert.*;

public class AppSymflowerTest {
	@Test
	public void checkFib1() {
		int n = -1;
		int[] valuesToTest = null;
		boolean expected = false;
		boolean actual = pan.symflower.test.App.checkFib(n, valuesToTest);

		assertEquals(expected, actual);
	}

	@Test
	public void fib2() {
		int n = 0;
		int expected = 0;
		int actual = pan.symflower.test.App.fib(n);

		assertEquals(expected, actual);
	}

	@Test
	public void fib3() {
		int n = 11;
		int expected = -1;
		int actual = pan.symflower.test.App.fib(n);

		assertEquals(expected, actual);
	}

	@Test
	public void fib4() {
		int n = 2;
		int expected = 1;
		int actual = pan.symflower.test.App.fib(n);

		assertEquals(expected, actual);
	}

	@Test
	public void makeFib5() {
		int n = -1;
		int[] expected = {  };
		int[] actual = pan.symflower.test.App.makeFib(n);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void makeFib6() {
		int n = 0;
		int[] expected = {  };
		int[] actual = pan.symflower.test.App.makeFib(n);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void makeFib7() {
		int n = 1;
		int[] expected = { 0 };
		int[] actual = pan.symflower.test.App.makeFib(n);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void makeFib8() {
		int n = 11;
		int[] expected = {  };
		int[] actual = pan.symflower.test.App.makeFib(n);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}
}
