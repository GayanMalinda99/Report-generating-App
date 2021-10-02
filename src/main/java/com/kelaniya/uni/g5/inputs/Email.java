package com.kelaniya.uni.g5.inputs;

import java.util.Scanner;

public class Email {

    public String getEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Email:  ");
        String email = scanner.nextLine();

        return email;
    }
}
