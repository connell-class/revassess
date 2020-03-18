package com.tier2.answers;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class Answer3Tests {

    private static File answer3;
    private static String answer3Contents;

    @Before
    public void setup() {
        answer3 = new File("src/sql/answer3.sql");
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(answer3));
            while ((line = br.readLine()) != null) {
                answer3Contents += line;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        assertTrue(false);
        // Session sess = TestConfiguration.getSessionFactory().openSession();
        // Transaction tx = sess.beginTransaction();
        // tx.rollback();

        PointsTests.addPoints(30);
    }
}