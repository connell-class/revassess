package com.rev.config;

import java.sql.Connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestConfig{
    
    private static SessionFactory sesfact;

    private static SessionFactory getFactory(){
        return new Configuration()
        .setProperty("hibernate.connection.url", ConnectionConfig.URL)
        .setProperty("hibernate.connection.username", ConnectionConfig.USERNAME)
        .setProperty("hibernate.connection.password", ConnectionConfig.PASSWORD)
        .setProperty("hibernate.connection.pool_size", "1")
        .setProperty("hibernate.connection.isolation", String.valueOf(Connection.TRANSACTION_SERIALIZABLE))
        .setProperty("hibernate.hbm2ddl.auto", "none")
        .setProperty("hibernate.show_sql", "true")
        .buildSessionFactory();   
    }

    public static SessionFactory getInstance(){
        if(sesfact == null){
            sesfact = getFactory();
        }
        return sesfact;
    }

    private TestConfig(){}
}