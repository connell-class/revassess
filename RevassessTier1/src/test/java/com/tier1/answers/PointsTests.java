package com.tier1.answers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PointsTests {


    private static int points;

    public static void addPoints(int x){
        points += x;
    }
    public static int getPoints(){
        return points;
    }

    @Test
    public void MoveOn(){
        assertTrue(points >= 60);
    }
}