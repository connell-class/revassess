package com.tier2.answers;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class Answer2Tests {

    private static File answer2;
    private static String answer2Contents;

    @Before
    public void setup() {
        answer2 = new File("src/sql/answer2.sql");
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(answer2));
            while ((line = br.readLine()) != null) {
                answer2Contents += line;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        assertTrue(false);
        // Session sess = TestConfiguration.getSessionFactory().openSession();
        // Transaction tx = sess.beginTransaction();
        // tx.rollback();

        PointsTests.addPoints(20);
    }
}