package com.Report.Generating.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connectDatabase()

    {
        try {
            final String url = "jdbc:mysql://localhost:3306/classicmodels";
            final String user = "root";
            final String password = "ragul0506";

            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
