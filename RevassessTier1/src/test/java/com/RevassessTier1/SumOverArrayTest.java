package com.RevassessTier1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.RevassessTier1.SumOverArray;

public class SumOverArrayTest {

	@Test
	public void testMethodDoesNotReturnDefault() {
		int[] arr = { 1, 2, 3 };
		assertNotEquals(SumOverArray.IterateAndSum(arr), 0);
	}

	@Test
	public void testDoesntThrow() {
		try {
			SumOverArray.IterateAndSum(null);
			assertTrue(true);
		} catch (NullPointerException e) {
			fail();
		}
	}

	@Test
	public void testItSums() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		assertEquals(SumOverArray.IterateAndSum(arr), 78);
	}

	@Test
	public void testTakesNegatives() {
		int[] arr = { -1, -2, -3, -4, -5, -6, -7, -8, -9 };
		assertEquals(SumOverArray.IterateAndSum(arr), 45);
	}

	@Test
	public void testMoreNumsW() {
		int[] arr = { 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 };
		assertEquals(SumOverArray.IterateAndSum(arr), 1095);
	}

}
