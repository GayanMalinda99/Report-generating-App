package com.kelaniya.uni.v1;

import java.util.Scanner;

public class GetReportTimePeriod {
    public int userInput(){
        Scanner sc=new Scanner(System.in);

        System.out.println("\nSelect time period:\nEnter 1 for Last Week report\nEnter 2 for Last Month report\n" +
                "Enter 3 for Anual report\nSelect:");
        int getTimePeriod= sc.nextInt();
        while (1 != getTimePeriod && 2 != getTimePeriod && 3 != getTimePeriod){
            System.out.println("Wrong input\nSelect:");
            getTimePeriod= sc.nextInt();
        }

        return getTimePeriod;
    }
}
