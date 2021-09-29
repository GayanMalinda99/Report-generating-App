package com.Report.Generating.App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetResult {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.connectDatabase();
        Query query = new Query();

        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query.getQuery());
            while(result.next()) {
                System.out.println(result.getString("customerName"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

    }

}
