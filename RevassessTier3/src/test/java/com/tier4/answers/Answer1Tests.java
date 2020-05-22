package com.tier4.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        CallableStatement cs = ConnectionConfig.connect().prepareCall("{? = call ceil(?)}");
        cs.setDouble(2, 2.5);
        cs.registerOutParameter(1, Types.INTEGER);
        assertEquals(3, cs.executeQuery().getInt(1));
        addPoints(10);
    }
}