package com.tier3.answers;

import static com.tier3.answers.PointsTests.addPoints;
import static org.junit.Assert.assertTrue;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.StoredProcedureQuery;

import com.rev.config.ConnectionConfig;
import com.rev.config.TestConfig;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * prompt: Implement a stored procedure that takes a user's id as an IN
 * parameter and a cursor as a OUT parameter. This procedure will insert a
 * result set into the provided cursor; the result set must contain the study
 * sets belonging to the user with the provided id.
 */
public class Answer4Tests {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void test4() {
      try(Connection conn = DriverManager.getConnection(ConnectionConfig.URL, ConnectionConfig.USERNAME, ConnectionConfig.PASSWORD){

        String sql = "{ ? = call ?(?,?)";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(2, ConnectionConfig.TIER_3_PROCEDURE_NAME);
        cs.registerOutParameter(1, Types.REF_CURSOR);
        cs.setInt(3, 1);
        cs.registerOutParameter(3, Types.REF_CURSOR);
        ResultSet rs = cs.executeQuery();
        while(rs.next()){
          System.out.println(rs.getInt(1));
        }
      } catch(SQLException e){
          e.printStackTrace();
      }
    }
}