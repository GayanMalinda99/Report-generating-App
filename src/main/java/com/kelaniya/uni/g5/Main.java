package com.kelaniya.uni.g5;



import com.kelaniya.uni.g5.inputs.Inputs;
import com.kelaniya.uni.g5.inputs.InvalidInputException;
import com.kelaniya.uni.g5.inputs.ReportTypeAndDurationUserInputs;
import com.kelaniya.uni.g5.reports.OperationFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Inputs inputs = new ReportTypeAndDurationUserInputs();
        String reportType;
        String startingDate;
        String endingDate;
        String sendingType;

        try {
            reportType = inputs.getReportType();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
        try {
            startingDate = inputs.getStartingDate();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
        try {
            endingDate = inputs.getEndingDate();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
        try {
            sendingType = inputs.getStoringAndSendingType();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }


        OperationFactory operationFactory = new OperationFactory();
        operationFactory.getInstance(reportType, startingDate, endingDate);





    }
}
