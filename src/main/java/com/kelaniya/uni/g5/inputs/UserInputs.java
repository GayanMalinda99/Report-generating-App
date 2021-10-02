package com.kelaniya.uni.g5.inputs;

import java.util.Scanner;

public class UserInputs implements Inputs {

    public String getReportType() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        String reportType;
        System.out.println("Enter report type( Detailed report - 1 | Summary report - 2 | exit - 0):  ");
        reportType = scanner.nextLine();

        if(!((reportType.equals("1")) || (reportType.equals("2")))){
            System.out.println("Please enter valid argument. (Detailed report - 1 | Summary report - 2 | exit - 0)");
            scanner.close();
            this.getReportType();
        }else if(reportType.equals("0")){
            System.out.println("Program Exit");
            scanner.close();
            System.exit(0);
        }
        scanner.close();

        return reportType;
    }

    public String getStartingDate() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        String startingDate;
        System.out.println("Enter starting date (exit - 0):  ");
        startingDate = scanner.nextLine();

       if(startingDate.equals("0")){
            System.out.println("Program Exit");
            scanner.close();
            System.exit(0);
        }
        scanner.close();

        return startingDate;
    }

    public String getEndingDate() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        String endingDate;
        System.out.println("Enter ending date (exit - 0):  ");
        endingDate = scanner.nextLine();

        if(endingDate.equals("0")){
            System.out.println("Program Exit");
            scanner.close();
            System.exit(0);
        }
        scanner.close();

        return endingDate;
    }

    public String getSendingType() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        String sendingType;
        System.out.println("Enter report type (exit - 0):  ");
        sendingType = scanner.nextLine();

        if(sendingType.equals("0")){
            System.out.println("Program Exit");
            scanner.close();
            System.exit(0);
        }
        scanner.close();

        return sendingType;
    }


}
