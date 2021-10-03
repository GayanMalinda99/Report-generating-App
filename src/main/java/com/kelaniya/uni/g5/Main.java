package com.kelaniya.uni.g5;

import com.kelaniya.uni.g5.inputs.*;
import com.kelaniya.uni.g5.reports.DetailedReport;
import com.kelaniya.uni.g5.reports.SummaryReport;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{


        GetReportType reportType = new GetReportType(args);
        GetStartDate startDate = new GetStartDate(args);
        GetEndDate endDate = new GetEndDate(args);
        GetRequestMethod requestMethod = new GetRequestMethod(args);
        GetEmail getEmail = new GetEmail(args);
        //DetailedReport detailedReport=new DetailedReport();


        //detailedReport.execute(startDate.getStartDate(),endDate.getEndDate());
        System.out.println(reportType.validateType());

        if (reportType.validateType().equals("Summery"))
        {
            SummaryReport summaryReport = new SummaryReport();

            summaryReport.execute(startDate.getStartDate(), endDate.getEndDate());

        }
        else if (reportType.validateType().equals("Detailed"))
        {
            DetailedReport detailedReport=new DetailedReport();

            detailedReport.execute(startDate.getStartDate(),endDate.getEndDate());

        }
        else
        {
            System.out.println("Invalid Argument for Report Type");
        }





    }
}
