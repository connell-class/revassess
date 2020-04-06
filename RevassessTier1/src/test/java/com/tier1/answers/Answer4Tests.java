package com.tier1.answers;

import static com.tier1.answers.PointsTests.addPoints;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.tier1.NumberSumLength;

import org.junit.Test;

public class Answer4Tests {

    @Test
    public void test4(){
		assertTrue(NumberSumLength.checkNumberPowerLength(1));
		assertFalse(NumberSumLength.checkNumberPowerLength(10));
		assertTrue(NumberSumLength.checkNumberPowerLength(153));
		assertFalse(NumberSumLength.checkNumberPowerLength(1635));
        addPoints(40);
    }
}