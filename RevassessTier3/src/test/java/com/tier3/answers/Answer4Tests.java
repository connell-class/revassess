package com.tier3.answers;

import static com.tier3.answers.PointsTests.addPoints;
import static org.junit.Assert.assertEquals;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.rev.config.ConnectionUtil;

import org.junit.Test;

/**
 * prompt: 
 * Implement a stored procedure that takes a user's id as an IN
 * parameter and a cursor as a OUT parameter. This procedure will insert a
 * result set into the provided cursor; the result set must contain the study
 * sets belonging to the user with the provided id.
 */
public class Answer4Tests {


    @Test
    public void test4() {
      try (Connection conn = DriverManager.getConnection(ConnectionUtil.URL, ConnectionUtil.USERNAME, ConnectionUtil.PASSWORD)) {
        String sql = "{ call " + ConnectionUtil.TIER_3_PROCEDURE_NAME + "(?, ?) }";
        CallableStatement cs = conn.prepareCall(sql);
        // First parameter is set to user_id 4, since this user owns study sets
        int userId = 4;
        cs.setInt(1, userId);
        // Second parameter is the cursor
        cs.registerOutParameter(2, Types.REF_CURSOR);
        // Manually execute callable statement
        cs.execute();
        // Select OUT parameter
        ResultSet rs = (ResultSet) cs.getObject(2);
        while (rs.next()) {
            // Assert that user_id is the owner of every study set
            // Expects user_id 4 from every third column (OWNER_ID)
            assertEquals(userId, rs.getInt(3));
        }
      } catch(SQLException e){
          e.printStackTrace();
      }
      addPoints(40);
    }
}