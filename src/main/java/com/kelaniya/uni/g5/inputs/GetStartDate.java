package com.kelaniya.uni.g5.inputs;

public class GetStartDate {
    private final String[] args;

    public GetStartDate(String[] arguments) {
        this.args = arguments;
    }

    public String getStartDate() {

        String startDate = args[1];
        //YMD
        String type = "^[\\d]{4}-[\\d]{2}-[\\d]{2}$";

        if (!startDate.matches(type)) {
            System.out.println("Please provide the correct start date as argument");
            return "";
        }
        return startDate;
    }
}
