package com.kelaniya.uni.g5.inputs.IO;

public class GetReportType {
    private final String[] args;

    public GetReportType(String[] arguments) {
        this.args = arguments;
    }

    public String validateType(){

        String reportType = args[0];
        if (!(reportType.equals("Summery") || reportType.equals("Detailed"))) {
            System.out.println("Please provide the correct report type as argument");
            return "";
        }

        return reportType;
    }
}
