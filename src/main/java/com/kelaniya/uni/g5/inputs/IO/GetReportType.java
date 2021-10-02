package com.kelaniya.uni.g5.inputs.IO;

public class GetReportType {
    private String[] args = new String[0];

    public GetReportType(String[] args) {
        this.args = args;
    }



    public String validateType(){

        String reportType = args[0];
        if (!(reportType.equals("Summary") || reportType.equals("Detailed"))) {
            System.out.println("Please provide the correct report type as argument");
            return "";
        }


        return reportType;
    }
}
