package com.example.demo.sendingEmail;

import java.util.Scanner;

public class EmailAddressGetter {

    public String getEmail() {
        System.out.println("Enter email address");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        return email;
    }
}
