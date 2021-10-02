package com.kelaniya.uni.g5.inputs;

import java.util.Scanner;

public class ReportTypeAndDurationUserInputs implements Inputs {

    Scanner scanner = new Scanner(System.in);

    public String getReportType() {
        System.out.print("Enter report type:  ");

        return scanner.nextLine();
    }

    public String getStartingDate() {
        System.out.print("Enter starting date:  ");

        return scanner.nextLine();
    }

    public String getEndingDate() {
        System.out.print("Enter ending date:  ");

        return scanner.nextLine();
    }

    public String getStoringAndSendingType() {
        System.out.println("Which method do you want to save it?");
        System.out.print("(Save to local machine - 1 | Send as an Email - 2)  "  );

        return scanner.nextLine();
    }


}
