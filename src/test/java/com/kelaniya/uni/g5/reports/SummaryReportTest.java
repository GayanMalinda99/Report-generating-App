package com.kelaniya.uni.g5.reports;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class SummaryReportTest {

    @Test
    public void should_return_SummaryReport_object(){

        SummaryReport summaryReport=new SummaryReport();
        //verify that the summaryReport object is an instance of SummaryReport class
        assertThat(summaryReport,instanceOf(SummaryReport.class));

    }




}