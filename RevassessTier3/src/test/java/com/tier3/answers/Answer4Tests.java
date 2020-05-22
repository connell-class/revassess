package com.tier3.answers;

import static com.tier3.answers.PointsTests.addPoints;
import static org.junit.Assert.assertEquals;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rev.config.ConnectionConfig;

import org.junit.Test;

/**
 * prompt: 
 * Implement a stored procedure that takes a user's id as an IN
 * parameter and a cursor as a OUT parameter. This procedure will insert a
 * result set into the provided cursor; the result set must contain the study
 * sets belonging to the user with the provided id.
 */
public class Answer4Tests {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void test4() {
      try(Connection conn = DriverManager.getConnection(ConnectionConfig.URL, ConnectionConfig.USERNAME, ConnectionConfig.PASSWORD)){

        String sql = "{ ? = call ?(?,?)";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(2, ConnectionConfig.TIER_3_PROCEDURE_NAME);
        cs.registerOutParameter(1, Types.REF_CURSOR);
        cs.setInt(3, 1);
        cs.registerOutParameter(3, Types.REF_CURSOR);
        ResultSet rs = cs.executeQuery();
        while(rs.next()){
          assertEquals(1,rs.getInt(1));
        }
      } catch(SQLException e){
          e.printStackTrace();
      }
      addPoints(40);
    }
}