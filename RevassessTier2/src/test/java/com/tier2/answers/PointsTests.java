package com.tier2.answers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointsTests {
    private static int points;

    public static void addPoints(int x) {
        points += x;
    }
    public static int getPoints(){
        return points;
    }

    @Test
    public void moveOn() {
        assertTrue(points >= 60);
    }
    @Before
    public void printPoints(){
        System.out.println("_points: "+points);
    }
}