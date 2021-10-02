package com.kelaniya.uni.g5;

import com.kelaniya.uni.g5.inputs.Inputs;
import com.kelaniya.uni.g5.inputs.InvalidInputException;
import com.kelaniya.uni.g5.inputs.UserInputs;
import com.kelaniya.uni.g5.reports.OperationFactory;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InvalidInputException {

        Inputs inputs = new UserInputs();

        String reportType = inputs.getReportType();
        String startingDate = inputs.getStartingDate();
        String endingDate = inputs.getEndingDate();
        String sendingType = inputs.getSendingType();

        OperationFactory operationFactory = new OperationFactory();
        operationFactory.getInstance(reportType, startingDate, endingDate);





    }
}
