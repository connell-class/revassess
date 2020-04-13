package com.tier2.answers;

import static com.tier2.config.TestConfiguration.getFileContents;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import com.tier2.config.TestConfiguration;
import com.tier2.model.UserProblem4;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
/**
 * prompt:
 * Write a query that will obtain 
 * the owner’s username, as well 
 * as the category name, questions, 
 * and answers of flashcard contained 
 * within the study set with and id of 4.
 */
public class Answer4Tests {

    private String answer4Contents;
    
    @Before
    public void setup() {
        try {
            answer4Contents = getFileContents("answer4");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {
        Session sess = TestConfiguration.getSessionFactory().openSession();
        Transaction tx = sess.beginTransaction();
        List<UserProblem4> users = sess.createNativeQuery(answer4Contents, UserProblem4.class).list();
        assertEquals(9, users.size());
        tx.rollback();

        PointsTests.addPoints(40);
    }

}