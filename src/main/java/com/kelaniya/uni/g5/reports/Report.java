package com.kelaniya.uni.g5.reports;

public interface Report {

    void execute(String startingTime, String endingTime) throws InvalidReportException;

}
