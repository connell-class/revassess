package com.tier1.answers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class PointsTests {


    private static int points;

    public static void addPoints(int x){
        points += x;
    }
    public static int getPoints(){
        return points;
    }

@Before
public void print(){
    System.out.println("_points:"+points);
}
    @Test
    public void MoveOn(){
        assertTrue(points >= 60);
    }
    
}