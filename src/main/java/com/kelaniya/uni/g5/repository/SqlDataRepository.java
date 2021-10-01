package com.kelaniya.uni.g5.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDataRepository {

    public void getData() throws IOException, SQLException {

        // Read teh numbers from the database using JDBC connector and return the Data

        String jdbcURL="jdbc:mysql://localhost:3306/university";
        String username="root";
        String password="";

        Connection connection = DriverManager.getConnection(jdbcURL,username,password);

        String sql = "INSERT INTO users (first_name, last_name) VALUES ('Kamal','supun')";


    }

}
