package com.tier4.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.rev.config.ConnectionUtil;
import static com.tier3.answers.PointsTests.addPoints;

import org.junit.Before;
import org.junit.Test;

/**
 * prompt: Establish a connection to a deployed database using JDBC.
 */
public class Answer1Tests {

    private ConnectionUtil cu;

    @Before
    public void setup(){
        cu = ConnectionUtil.getInstance();
    }
    @Test
    public void testConnection() throws SQLException {
        assertNotNull(cu.connect());
        assertTrue(cu.connect().isValid(5));
        addPoints(10);
    }
}