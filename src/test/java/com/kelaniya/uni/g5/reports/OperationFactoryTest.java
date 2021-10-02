package com.kelaniya.uni.g5.reports;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class OperationFactoryTest {



    @Test
    public void should_return_DetailedReport_object_when_reportType_is_1(){

        OperationFactory operationFactory=new OperationFactory();
        Report report=operationFactory.getInstance("1");
        //verifying that the report object is an instance of DetailedReport class
        assertThat(report,instanceOf(DetailedReport.class));




    }

    @Test
    public void should_return_SummaryReport_object_when_reportType_is_2(){

        OperationFactory operationFactory=new OperationFactory();
        Report report=operationFactory.getInstance("2");
        //verifying that the report object is an instance of DetailedReport class
        assertThat(report,instanceOf(SummaryReport.class));




    }








}