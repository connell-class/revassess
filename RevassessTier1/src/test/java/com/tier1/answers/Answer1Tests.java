package com.tier1.answers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.tier1.CompareStrings;

import org.junit.Test;
import static com.tier1.answers.PointsTests.addPoints;

/**
 * prompt:
 * Create a method that checks if 
 * two strings are equal and return 
 * the boolean result.
 */
public class Answer1Tests {

    @Test
    public void test1(){
        assertFalse(CompareStrings.compareStrings("s1", "s2"));
        assertTrue(CompareStrings.compareStrings("hello", "hello"));
        assertTrue(CompareStrings.compareStrings("longhorn", "longhorn"));
        assertTrue(CompareStrings.compareStrings("gentleman", "gentleman"));
        assertFalse(CompareStrings.compareStrings("jekyll", "hyde"));
        assertFalse(CompareStrings.compareStrings("giraffes", "real"));
        addPoints(10);
    }

}