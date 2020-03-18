package com.tier2.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Optional;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestConfiguration {
    private static SessionFactory sesfact;
    static String engine;
    

    private static SessionFactory buildFactory() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(new File("src/sql/setup.properties")));
        return new Configuration()
            .setProperty("connection.username", props.getProperty("database.username") )
            .setProperty("connection.password", props.getProperty("database.password"))
            .setProperty("connection.url", props.getProperty("database.url"))
            .setProperty("connection.driver_class", findDriver(props))
            .setProperty("connection.pool_size", "1")
            .setProperty("hibernate.connection.isolation", String.valueOf(Connection.TRANSACTION_SERIALIZABLE))
            .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        if (!Optional.of(sesfact).isPresent()) {
            try {
                sesfact = buildFactory();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sesfact;
    }

    private static String findDriver(Properties props){
        engine=props.getProperty("database.engine");
        switch(engine){
            case "oraclesql":
                return "oracle.jdbc.OracleDriver";
            case "postgresql":
                return "org.postgresql.Driver";
            case "mysql":
                return "com.mysql.jdbc.Driver";
        }
        return "";
    }
    public static String getEngine(){
        return engine;
    }
}