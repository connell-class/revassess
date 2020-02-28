package com.RevassessTier1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.RevassessTier1.NumberSumLength;

public class NumberSumLengthTest {

	@Test
	public void test1() {
		assertTrue(NumberSumLength.checkNumberPowerLength(1));
	}

	///this implementation, preferably, needs to check all 2 digit numbers
	@Test
	public void testAll2DigitNums() {
		assertFalse(NumberSumLength.checkNumberPowerLength(10));
	}
	
	@Test
	public void testTrue() {
		assertTrue(NumberSumLength.checkNumberPowerLength(153));
	}
	
	@Test
	public void testFalse() {
		assertFalse(NumberSumLength.checkNumberPowerLength(1635));
	}
	
}
