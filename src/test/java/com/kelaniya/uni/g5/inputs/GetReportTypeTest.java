package com.kelaniya.uni.g5.inputs;

import com.kelaniya.uni.g5.inputs.GetReportType;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetReportTypeTest {

    @Test
    public void should_return_GetReportType_object(){
        String []args={"Summary 2012-12-12 2021-12-12 File sachithrabandara49@gmail.com"};
        GetReportType getReportType=new GetReportType(args);
        //verify that the getReportType object is an instance of GetReportType class
        assertThat(getReportType,instanceOf(GetReportType.class));

    }




}