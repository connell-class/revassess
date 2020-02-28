package com.RevassessTier1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.RevassessTier1.User;

public class UserTest {

	private Class<User> userClass;
	private List<Field> fields;
	private String[] fieldNames = {"id","firstName","lastName","userName","password","role"};
	
	@Before
	public void setUp() {
		userClass = User.class;
		fields = Arrays.asList(userClass.getDeclaredFields());
	}
	
	@Test
	public void checkFieldExists() {
		assertEquals(fields.size(), fieldNames.length);
	}
		
	@Test
	public void checkFieldNames() {
		fields.stream().forEach(e -> 
			assertNotEquals(Arrays.asList(fieldNames).indexOf(e.getName()),-1));
	}
}
