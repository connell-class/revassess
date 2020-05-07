package com.tier2.answers;

import static com.tier2.config.TestConfiguration.getFileContents;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import com.tier2.config.TestConfiguration;
import com.tier2.model.User;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

/**
 * prompt:
 * Write a query that 
 * will find all user 
 * info related to users
 * with a role of BASIC_USER
 */
public class Answer1Tests {

    private String answer1Contents;

    @Before
    public void setup() {
        try {
            answer1Contents = getFileContents("answer1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        Session sess = TestConfiguration.getSessionFactory().openSession();
        Transaction tx = sess.beginTransaction();
        List<User> users = sess.createNativeQuery(answer1Contents, User.class).list();
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getUserRole());
        assertEquals("Jason", users.get(0).getFirstName());
        assertEquals("Knighten", users.get(0).getLastName());
        assertEquals("knifehand", users.get(0).getPassword());
        assertEquals("mknighten", users.get(0).getUsername());
        tx.rollback();
        PointsTests.addPoints(10);
    }
}