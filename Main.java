package com.kelaniya.uni.v1;



public class Main {
    public static void main(String[] arg){
//Get Report Type
        GetReportType reportType = new GetReportType();
        int typeValue=reportType.userInput();
//Get Report Time period
        GetReportTimePeriod reportTime = new GetReportTimePeriod();
        int timeValue=reportTime.userInput();
//Get Report Method
        GetRequestMethod reportMethod = new GetRequestMethod();
        int methodValue = reportMethod.userInput();
    }
}
