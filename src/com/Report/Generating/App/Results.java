package com.Report.Generating.App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Results {
    public static ArrayList<String> getResults() {
        Connection connection = DatabaseConnection.connectDatabase();
        Query query = new Query();

        ArrayList<String> results = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query.getQuery());
            while(result.next()) {
                results.add(result.getString("employeeNumber") +"\t"+ result.getString("lastName")
                        +"\t"+result.getString("firstName")+"\t"+ result.getString("email"));
            }
            return results;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
