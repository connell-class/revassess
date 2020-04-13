package com.rev.config;

import java.sql.Connection;

/**
 * 
 * @author Revature
 *
 *This is a paceholder class to hold the configurations of your db connection.
 *You should change the url, username, and password. DO NOT CHANGE 
 *THE MODIFIERS OR THE NAMES OF THE VARIABLES. These are 
 *used to test your db schema. 
 */
public class ConnectionConfig {
	public static final String URL = "jdbc:postgresql://postgresql-class.cks98gmxels6.us-west-1.rds.amazonaws.com:5432/quizzard";
	public static final String USERNAME = "connellrobert";
	public static final String PASSWORD = "Leland2012";
	public static final String TIER_3_PROCEDURE_NAME="test";

	public static Connection connect(){
		return null;
	}
}