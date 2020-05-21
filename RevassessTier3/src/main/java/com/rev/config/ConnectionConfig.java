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
	public static final String URL = "";
	public static final String USERNAME = "";
	public static final String PASSWORD = "";
	public static final String TIER_3_PROCEDURE_NAME="";
	public static final String TIER_3_SEQUENCE_NAME="";
	public static Connection connect(){
		return null;
	}

	public static long callAbsoluteValueFunction(long value){
		return value;
	}
	private ConnectionConfig(){
		super();
	}
}