package com.kelaniya.uni.v1;

import java.util.Scanner;

public class GetRequestMethod {
    public int userInput(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Select report Request method:\nEnter 1 for E-mail\nEnter 2 for Exsel \nSelect:");
        int getReportRequestType= sc.nextInt();
        while (1 != getReportRequestType && 2 != getReportRequestType){
            System.out.println("Wrong input\nSelect:");
            getReportRequestType= sc.nextInt();
        }
        return getReportRequestType;
    }
}
