package com.example.demo.sendingEmail;

public class EmailVerifier {

    private final String[] verfiedEmails = {"tharakaariyarathna04@gmail.com"};
    public boolean verifyEmail(String userEmail) {
        if (userEmail.equals(verfiedEmails[0])) {
            return true;
        } else {
            return false;
        }
    }
}
