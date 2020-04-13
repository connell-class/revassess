package com.tier4.answers;

import static org.junit.Assert.assertNotNull;

import com.rev.config.ConnectionConfig;

import org.junit.Test;
import static com.tier4.answers.PointsTests.addPoints;

/**
 * prompt:
 * Establish a connection to 
 * a deployed database using 
 * JDBC.
 */
public class Answer2Tests {

    @Test
    public void testConnection(){
        assertNotNull(ConnectionConfig.connect());
        addPoints(20);
    }
}