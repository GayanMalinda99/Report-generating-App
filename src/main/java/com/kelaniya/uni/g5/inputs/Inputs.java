package com.kelaniya.uni.g5.inputs;

public interface Inputs {
    String getReportType() throws InvalidInputException;
    String getStartingDate() throws InvalidInputException;
    String getEndingDate() throws InvalidInputException;
    String getStoringAndSendingType() throws InvalidInputException;
}
