package com.pdf;

public interface Inputs {

    String getReportType() throws InvalidInputException;
    String getStartingDate() throws InvalidInputException;
    String getEndingDate() throws InvalidInputException;
    String getSendingType() throws InvalidInputException;
}
