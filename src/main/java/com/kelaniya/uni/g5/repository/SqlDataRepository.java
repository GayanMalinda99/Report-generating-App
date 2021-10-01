package com.kelaniya.uni.g5.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDataRepository {

    public void getData() {

        // Create mysql database connection
        String jdbcURL="jdbc:mysql://localhost:3306/university";
        String username="root";
        String password="";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "INSERT INTO users (first_name, last_name) VALUES ('Kamal','supun')";


    }

}
