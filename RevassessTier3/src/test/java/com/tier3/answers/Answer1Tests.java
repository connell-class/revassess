package com.tier3.answers;

import static com.tier3.answers.PointsTests.addPoints;
import static org.junit.Assert.assertEquals;

import com.rev.config.TestConfig;

import org.hibernate.Session;
import org.junit.Test;

/**
 * prompt:
 * Create an AWS RDS Instance 
 * (vendor can be either Oracle or PostgreSQL)
 */
public class Answer1Tests {

    /**
     * tests the connection to the db instance to ensure there is one
     */
    @Test
    public void test1(){
        Session sess = TestConfig.getInstance().openSession();
        assertEquals(10,sess.createNativeQuery("select * from abs(-10)", Integer.class));
        addPoints(10);
    }
}