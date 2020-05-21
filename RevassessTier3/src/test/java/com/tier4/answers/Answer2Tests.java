package com.tier4.answers;

import static org.junit.Assert.assertEquals;
import static com.tier4.answers.PointsTests.addPoints;

import com.rev.config.ConnectionConfig;

import org.junit.Test;

/**
 * prompt:
 * implement the ConnectionConfig 
 * class's callAbsoluteValueFunction 
 * method with a callable statement 
 * to call the absolute value scalar 
 * function.
 */
public class Answer2Tests {

    @Test
    public void test2(){
        assertEquals(100,ConnectionConfig.callAbsoluteValueFunction(-100));
        assertEquals(60, ConnectionConfig.callAbsoluteValueFunction(60));
        addPoints(20);
    }
}