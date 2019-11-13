package br.com.emotional.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {	
	private final String URL = "jdbc:mysql://localhost:3306/Emotional_BD?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
	private final String USER = "root";
	private final String PASS = "admin";


	/*
    public Connection getConnection() throws Exception {       
    		return DriverManager.getConnection(URL,USER,PASS);
      
    }
    */

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
