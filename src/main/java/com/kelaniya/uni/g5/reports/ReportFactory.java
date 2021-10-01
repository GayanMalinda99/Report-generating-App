package com.kelaniya.uni.g5.reports;

public class ReportFactory {

    public Report getInstance(String reportType){

        //Decision Making + Coordination
        Report report = null;
        if (reportType.equals("1")){
            report = (Report) new DetailedReport();
        }else if (reportType.equals("2")){
            report = (Report) new SummaryReport();
        } // Violation of OCP -> This is a known violation

        return report;

    }


}
