package com.tier3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tier3Test{
    private static int points;

    @Test
    public void test1(){
        assertTrue(true);
        points+=10;
    }

    @Test
    public void test2(){
        assertTrue(false);
        points+=20;
    }

    @Test
    public void test3(){
        assertTrue(false);
        points+=30;
    }

    @Test
    public void test4(){
        assertTrue(false);
        points+=40;
    }

    @Test
    public void moveOn(){
        assertTrue(points>=60);
    }
}