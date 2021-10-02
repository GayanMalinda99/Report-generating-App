package com.kelaniya.uni.g5;

import com.kelaniya.uni.g5.inputs.IO.*;
import com.kelaniya.uni.g5.inputs.Inputs;
import com.kelaniya.uni.g5.inputs.InvalidInputException;
import com.kelaniya.uni.g5.inputs.UserInputs;
import com.kelaniya.uni.g5.reports.DetailedReport;
import com.kelaniya.uni.g5.reports.OperationFactory;
import com.kelaniya.uni.g5.reports.SummaryReport;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InvalidInputException {


        GetReportType reportType = new GetReportType(args);
        GetStartDate startDate = new GetStartDate(args);
        GetEndDate endDate = new GetEndDate(args);
        GetRequestMethod requestMethod = new GetRequestMethod(args);
        GetEmail getEmail = new GetEmail(args);
        DetailedReport detailedReport=new DetailedReport();

        
        detailedReport.execute(startDate.getStartDate(),endDate.getEndDate());







    }
}
