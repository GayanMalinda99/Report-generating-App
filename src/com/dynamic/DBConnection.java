package com.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public Connection getConnection()
    {
        Connection connection=null;
        System.out.println("Connection Called");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}

