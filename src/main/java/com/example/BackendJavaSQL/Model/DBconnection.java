package com.example.BackendJavaSQL.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    //MySQL URL
    private static final String db_URL = "jdbc:mysql://csproject.sit.kmutt.ac.th:3306/db63130500211";
    public static Connection getMySQLConnection() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(db_URL, "63130500211", "abcd1234");
            return connection;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
