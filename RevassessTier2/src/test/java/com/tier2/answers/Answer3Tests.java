package com.tier2.answers;

import static com.tier2.config.TestConfiguration.getFileContents;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import com.tier2.config.TestConfiguration;
import com.tier2.model.UserStudySet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
/**
 * prompt:
 * Write a query that will 
 * find all user and study 
 * set info related to the 
 * user with an id of 5

 */
public class Answer3Tests {

    private String answer3Contents;

    @Before
    public void setup() {
        try {
            answer3Contents = getFileContents("answer3");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        Session sess = TestConfiguration.getSessionFactory().openSession();
        Transaction tx = sess.beginTransaction();
        List<UserStudySet> users = sess.createNativeQuery(answer3Contents, UserStudySet.class).list();
        assertEquals(3, users.size());
        tx.rollback();

        PointsTests.addPoints(30);
    }


    
}