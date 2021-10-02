package com.kelaniya.uni.g5.reports;

import com.kelaniya.uni.g5.storingAndSending.EmailSender;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class DetailedReportTest {


    @Test
    public void should_return_DetailedReport_object(){

        DetailedReport detailedReport=new DetailedReport();
        //verify that the detailReport object is an instance of DetaildeReport class
        assertThat(detailedReport,instanceOf(DetailedReport.class));

    }


}