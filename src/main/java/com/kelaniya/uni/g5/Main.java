package com.kelaniya.uni.g5;

import com.kelaniya.uni.g5.inputs.IO.*;
import com.kelaniya.uni.g5.inputs.Inputs;
import com.kelaniya.uni.g5.inputs.InvalidInputException;
import com.kelaniya.uni.g5.inputs.UserInputs;
import com.kelaniya.uni.g5.reports.OperationFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InvalidInputException {


        GetReportType reportType = new GetReportType(args);
        GetStartDate startDate = new GetStartDate(args);
        GetEndDate endDate = new GetEndDate(args);
        GetRequestMethod requestMethod = new GetRequestMethod(args);
        GetEmail getEmail = new GetEmail(args);

        System.out.println(reportType.validateType());
        System.out.println(startDate.getStartDate());
        System.out.println(endDate.getEndDate());
        System.out.println(requestMethod.getRequsetMethod());
        System.out.println(getEmail.getEmail());
//





    }
}
