package com.kelaniya.uni.g5;

import com.kelaniya.uni.g5.inputs.*;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException  {

        GetReportType reportType = new GetReportType(args);
        GetStartDate startDate = new GetStartDate(args);
        GetEndDate endDate = new GetEndDate(args);
        GetRequestMethod requestMethod = new GetRequestMethod(args);
        GetEmail getEmail = new GetEmail(args);

        System.out.println(reportType.validateType());

        ReportGeneratingApp app = new ReportGeneratingApp(reportType,startDate,endDate,requestMethod,getEmail);
        app.execute();

    }

}
