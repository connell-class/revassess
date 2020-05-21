package com.tier4.answers;

import static org.junit.Assert.assertNotNull;

import com.rev.config.ConnectionConfig;
import static com.tier3.answers.PointsTests.addPoints;

import org.junit.Test;

/**
 * prompt:
 * Establish a connection to 
 * a deployed database using 
 * JDBC.
 */
public class Answer1Tests {

    @Test
    public void testConnection(){
        assertNotNull(ConnectionConfig.connect());
        addPoints(10);
    }
}