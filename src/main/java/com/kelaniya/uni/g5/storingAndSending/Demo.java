package com.kelaniya.uni.g5.storingAndSending;

public class Demo {

    public static void main(String[] args){

        EmailSender emailSender = new EmailSender();
        String emailAddress = emailSender.getEmail();
        boolean emailVerified = emailSender.verifyEmail(emailAddress);
        boolean internetAvailable = emailSender.netIsAvailable();
        if (emailVerified) {
            if (internetAvailable) {
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


