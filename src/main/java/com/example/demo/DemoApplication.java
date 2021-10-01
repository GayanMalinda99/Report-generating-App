package com.example.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DemoApplication {

    public static void main(String[] args) throws IOException, SQLException {
/*
        String jbdcURL="jdbc:mysql://localhost:3306/university";
        String username="root";
        String password="";

        Connection connection = DriverManager.getConnection(jbdcURL,username,password);

        String sql = "INSERT INTO users (first_name, last_name) VALUES ('Kamal','supun')";
*/
    EmailSender emailSender = new EmailSender() ;
    emailSender.sendSimpleMessage() ;

    }


}
