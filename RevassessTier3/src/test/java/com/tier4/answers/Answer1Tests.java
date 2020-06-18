package com.tier4.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.rev.config.ConnectionConfig;
import static com.tier3.answers.PointsTests.addPoints;

import org.junit.Test;

/**
 * prompt: Establish a connection to a deployed database using JDBC.
 */
public class Answer1Tests {

    @Test
    public void testConnection() throws SQLException {
        assertNotNull(ConnectionConfig.connect());
        assertTrue(ConnectionConfig.connect().isValid(5));
        addPoints(10);
    }
}