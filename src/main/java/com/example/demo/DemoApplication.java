package com.example.demo;

import com.example.demo.sendingEmail.EmailAddressGetter;
import com.example.demo.sendingEmail.EmailSender;
import com.example.demo.sendingEmail.EmailVerifier;
import com.example.demo.sendingEmail.NetConnectionChecker;

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
        EmailVerifier emailVerifier = new EmailVerifier() ;
        boolean emailVerified = emailVerifier.verifyEmail(emailAddress);
        NetConnectionChecker netConnectionChecker = new NetConnectionChecker() ;
        boolean internetAvailable = netConnectionChecker.netIsAvailable();

        if (emailVerified) {
            if (internetAvailable) {
                EmailSender emailSender = new EmailSender();
                emailSender.sendSimpleMessage(emailAddress);
                System.out.println("Email sent successfully");
            } else {
                System.out.println("Can not send email. Internet connection problem occurred");
            }
        } else {
            System.out.println("Can not send email. Email not verified");
        }

    }



}
