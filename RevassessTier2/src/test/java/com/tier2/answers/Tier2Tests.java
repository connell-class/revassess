package com.tier2.answers;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.tier2.config.TestConfiguration;

import org.junit.BeforeClass;
import org.junit.Test;


public class Tier2Tests {
    private static File answer1, setupFile;
    private static String answer1Contents, setupFileContents;
    private static int points;

    @BeforeClass
    public static void setup() {
        answer1 = new File("src/sql/answer1.sql");
        setupFile = new File("src/test/resources/" + TestConfiguration.getEngine() + "_setup.sql");
        try {
            BufferedReader br = new BufferedReader(new FileReader(setupFile));
            String line;
            while((line=br.readLine())!=null){
                setupFileContents+=line;
            }
            br = new BufferedReader(new FileReader(answer1));
            while((line=br.readLine())!=null){
                answer1Contents+=line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        // Session sess = TestConfiguration.getSessionFactory().openSession();
        // Transaction tx = sess.beginTransaction();
        // sess.createNativeQuery(setupFileContents).executeUpdate();
        assertTrue(true);
        
        // tx.rollback();
        points+=10;
    }

    @Test
    public void test2(){
        assertTrue(false);
        points+=20;
    }
    
    @Test
    public void test3(){
        assertTrue(false);
        points+=30;
    }

    @Test
    public void test4(){
        assertTrue(false);
        System.out.println("made it to test 4");
        assertTrue(true);
        points+=40;
    }

    @Test
    public void MoveOn(){
        assertTrue(points>=60);
    }

}
