package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBCDemoCode1 {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/temp";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "1234";
    public static void main(String[] args) throws SQLException {
        System.out.println("jdbc hacking started");
        Connection connect = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_PASSWORD);
     System.out.println("databse connection is obtained....");
    

}
    
}  