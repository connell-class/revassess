package com.tier2.answers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.tier2.config.TestConfiguration;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnswerOneTest {
    private static File answer1, setupFile;
    private static String answer1Contents, setupFileContents;

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
        Session sess = TestConfiguration.getSessionFactory().openSession();
        Transaction tx = sess.beginTransaction();
        sess.createNativeQuery(setupFileContents).executeUpdate();
        
        
        tx.rollback();
    }

}
