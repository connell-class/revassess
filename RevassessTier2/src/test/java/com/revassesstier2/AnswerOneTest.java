package com.revassesstier2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnswerOneTest {
    private static File answer1, answer2, answer3, answer4;

    @BeforeClass
    public static void setup() {
        answer1 = new File("src/sql/answer1.sql");
        
    }


}
