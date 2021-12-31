package pan.symflower.test;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.*;
import static org.junit.Assert.*;

public class AppSymflowerTest {
	@Test
	public void main1() {
		java.lang.String[] args = null;
		pan.symflower.test.App.main(args);
	}

	@Test
	public void runCalculation2() {
		java.lang.Integer idx = null;
		java.lang.Integer[] allValues = null;
		java.lang.Integer expected = 0;
		java.lang.Integer actual = pan.symflower.test.App.runCalculation(idx, allValues);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void runCalculation3() {
		java.lang.Integer idx = 0;
		java.lang.Integer[] allValues = null;
		java.lang.Integer expected = 0;
		java.lang.Integer actual = pan.symflower.test.App.runCalculation(idx, allValues);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void runCalculation4() {
		java.lang.Integer idx = 0;
		java.lang.Integer[] allValues = {  };
		java.lang.Integer expected = 0;
		java.lang.Integer actual = pan.symflower.test.App.runCalculation(idx, allValues);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void runCalculation5() {
		java.lang.Integer idx = 0;
		java.lang.Integer[] allValues = { null };
		java.lang.Integer expected = 0;
		java.lang.Integer actual = pan.symflower.test.App.runCalculation(idx, allValues);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void runCalculation6() {
		java.lang.Integer idx = 0;
		java.lang.Integer[] allValues = { 0 };
		java.lang.Integer expected = 0;
		java.lang.Integer actual = pan.symflower.test.App.runCalculation(idx, allValues);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void runCalculation7() {
		java.lang.Integer idx = 715827904;
		java.lang.Integer[] allValues = { 3 };
		java.lang.Integer expected = -2147483584;
		java.lang.Integer actual = pan.symflower.test.App.runCalculation(idx, allValues);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}
}
