package com.tier4.answers;

import static com.tier4.answers.PointsTests.addPoints;
import static org.junit.Assert.assertTrue;

import static java.util.Arrays.asList;

import com.rev.dao.UserRepository;

import org.junit.Test;
/**
 * 
 * prompt:
 * Implement only the CrudRepository 
 * interface methods within UserRepository 
 * class using the provided class diagram
 * 
 */
public class Answer3Tests {

    @Test
    public void testImplementation(){
        Class<?>[] interfaces = UserRepository.class.getInterfaces();
        System.out.println(interfaces[0]);
        assertTrue(asList(interfaces).contains(com.rev.dao.CrudRepository.class));
        addPoints(30);
    }
}