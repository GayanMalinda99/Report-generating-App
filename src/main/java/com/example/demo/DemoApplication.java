package com.example.demo;

import com.example.demo.sendingEmail.*;
import com.example.demo.ui.CmdLineUI;
import kong.unirest.JsonNode;

import java.io.IOException;
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
        EmailAddressGetter emailAddressGetter = new EmailAddressGetter() ;
        String emailAddress = emailAddressGetter.getEmail();

        EmailSender emailSender = new EmailSender();
        JsonNode jsonNode =  emailSender.sendSimpleMessage(emailAddress);

        EndMessage endMessage = new EndMessage();
        String endText = endMessage.showEndText(jsonNode.toString()) ;

        CmdLineUI cmdLineUI = new CmdLineUI() ;
        cmdLineUI.showMessege(endText);

    }



}

























































