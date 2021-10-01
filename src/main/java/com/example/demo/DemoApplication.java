package com.example.demo;

import kong.unirest.JsonNode;

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
    String emailAddress = emailSender.getEmail() ;
    boolean emailVerified = emailSender.verifyEmail(emailAddress) ;
    if(emailVerified){
        JsonNode jsonNode =  emailSender.sendSimpleMessage(emailAddress) ;
        System.out.println("Email sent successfully");
    }else{
        System.out.println("Can not send email. Email not verifed");
    }

    }


}
