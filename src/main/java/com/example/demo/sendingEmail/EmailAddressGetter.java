package com.example.demo.sendingEmail;

import java.util.Scanner;

public class EmailAddressGetter {

    Scanner scanner = new Scanner(System.in);

    public String getEmail() {
        System.out.println("Enter the email address");
        String email = scanner.nextLine();
        return email;
    }
}
