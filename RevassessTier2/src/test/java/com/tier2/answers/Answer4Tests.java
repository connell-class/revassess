package com.tier2.answers;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class Answer4Tests {

    private static File answer4;
    private static String answer4Contents;
    
    @Before
    public void setup() {
        answer4 = new File("src/sql/answer4.sql");
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(answer4));
            while ((line = br.readLine()) != null) {
                answer4Contents += line;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {
        assertTrue(false);
        // Session sess = TestConfiguration.getSessionFactory().openSession();
        // Transaction tx = sess.beginTransaction();
        // tx.rollback();

        PointsTests.addPoints(40);
    }

}