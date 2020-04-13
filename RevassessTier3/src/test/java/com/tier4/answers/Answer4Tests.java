package com.tier4.answers;

import static com.tier4.answers.PointsTests.addPoints;
import static org.junit.Assert.assertEquals;

import com.rev.dao.CrudRepository;
import com.rev.dao.FlashcardRepository;
import com.rev.exception.ResourceNotfoundException;
import com.rev.exception.ResourcePersistenceException;
import com.rev.model.Role;

import org.junit.Test;

/**
 * prompt: Implement the entire class structure indicated in the provided class
 * diagram
 */
public class Answer4Tests {

    @Test
    public void testClasses() {
        assertEquals(String.valueOf(Role.class .getEnumConstants()[3]), "BASIC_USER");
        assertEquals(ResourceNotfoundException.class.getSuperclass(), Exception.class);
        assertEquals(CrudRepository.class, FlashcardRepository.class.getInterfaces()[0]);
        assertEquals(ResourcePersistenceException.class.getSuperclass(), Exception.class);
        addPoints(40);
    }
}