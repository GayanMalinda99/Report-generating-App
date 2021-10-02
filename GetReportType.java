package com.kelaniya.uni.v1;

import java.util.Random;
import java.util.Scanner;

public class GetReportType {
    public int userInput(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Select report type:\nEnter 1 for Summery report\nEnter 2 for Main report\nSelect:");
        int getReportType= sc.nextInt();
        while (1 != getReportType && 2 != getReportType){
            System.out.println("Wrong input\nSelect:");
            getReportType= sc.nextInt();
        }

        return getReportType;
    }


}
