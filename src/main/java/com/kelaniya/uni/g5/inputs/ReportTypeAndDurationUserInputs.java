package com.kelaniya.uni.g5.inputs;

import java.util.Scanner;

public class ReportTypeAndDurationUserInputs implements ReportTypeAndDurationInputs {

    Scanner scanner = new Scanner(System.in);

    public String getReportType() {
        System.out.print("Enter report type:  ");
        String reportType = scanner.nextLine();

        return reportType;
    }

    public String getStartingDate() {
        System.out.print("Enter starting date:  ");
        String startingDate = scanner.nextLine();

        return startingDate;
    }

    public String getEndingDate() {
        System.out.print("Enter ending date:  ");
        String endingDate = scanner.nextLine();

        return endingDate;
    }

    public String getStoringAndSendingType() {
        System.out.println("Which method do you want to save it?");
        System.out.print("(Save to local machine - 1 | Send as an Email - 2)"  );
        String sendingType = scanner.nextLine();

        return sendingType;
    }


}
