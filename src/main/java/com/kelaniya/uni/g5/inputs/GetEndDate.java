package com.kelaniya.uni.g5.inputs;

public class GetEndDate {
    private final String[] args;

    public GetEndDate(String[] arguments) {
        this.args = arguments;
    }

    public String getEndDate(){

        String endDate = args[2];
        //YMD
        String type ="^[\\d]{4}-[\\d]{2}-[\\d]{2}$";

        if (!endDate.matches(type)){
            System.out.println("Please provide the correct end date as argument");
            return "";
        }
        return endDate;
    }
}
