package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String URL= "jdbc:postgresql://localhost:5432/testjdbc" ;
    private static final String USER = "postgres";
    private static final String PASSWORD= "raketa"; 

    public static Connection gConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}