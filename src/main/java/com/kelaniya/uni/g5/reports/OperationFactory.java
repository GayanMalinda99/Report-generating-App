package com.kelaniya.uni.g5.reports;

public class OperationFactory {

    public Report getInstance(String reportType){

        //Decision Making + Coordination
        Report report = null;
        if (reportType.equals("1")){
            report = new DetailedReport();
        }else if (reportType.equals("2")){
            report =  new SummaryReport();
        } // Violation of OCP -> This is a known violation

//        return report;

        return report;
    }


}
