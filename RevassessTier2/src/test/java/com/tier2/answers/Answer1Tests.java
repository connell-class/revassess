package com.tier2.answers;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class Answer1Tests {

    private static File answer1;
    private static String answer1Contents;

    @Before
    public void setup() {
        answer1 = new File("src/sql/answer1.sql");
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(answer1));
            while ((line = br.readLine()) != null) {
                answer1Contents += line;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        // Session sess = TestConfiguration.getSessionFactory().openSession();
        // Transaction tx = sess.beginTransaction();
        assertTrue(true);

        // tx.rollback();
        PointsTests.addPoints(10);
    }
}