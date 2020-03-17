package com.tier1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Tier1Test {

    private static int points;

    @Test
    public void test2() {
        Class<User> userClass;
        List<Field> fields;
        String[] fieldNames = { "id", "firstName", "lastName", "userName", "password", "role" };
        userClass = User.class;
        fields = Arrays.asList(userClass.getDeclaredFields());
        assertEquals(fields.size(), fieldNames.length);
        fields.stream().forEach(e -> assertNotEquals(Arrays.asList(fieldNames).indexOf(e.getName()), -1));
        points += 20;
    }

    @Test
    public void test3() {
        int[] arr = { 1, 2, 3 };
        assertNotEquals(0, SumOverArray.IterateAndSum(arr));
        try {
            SumOverArray.IterateAndSum(null);
            assertTrue(true);
        } catch (NullPointerException e) {
            fail();
        }
        int [] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        assertEquals(78, SumOverArray.IterateAndSum(arr2));
        int[] arr3 = { -1, -2, -3, -4, -5, -6, -7, -8, -9 };
		assertEquals(45, SumOverArray.IterateAndSum(arr3));
		int[] arr4 = { 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 };
		assertEquals(1095, SumOverArray.IterateAndSum(arr4));
        points+=30;
    }

    @Test
    public void test4(){
		assertTrue(NumberSumLength.checkNumberPowerLength(1));
		assertFalse(NumberSumLength.checkNumberPowerLength(10));
		assertTrue(NumberSumLength.checkNumberPowerLength(153));
		assertFalse(NumberSumLength.checkNumberPowerLength(1635));
        points+=40;
    }

    @Test
    public void moveOn(){
        assertTrue(points>=60);
    }
}