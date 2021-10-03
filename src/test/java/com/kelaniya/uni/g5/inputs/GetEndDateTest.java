package com.kelaniya.uni.g5.inputs;


import com.kelaniya.uni.g5.inputs.GetEndDate;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetEndDateTest {

    @Test
    public void should_return_GetEndDate_object(){
        String []args={"Summary 2012-12-12 2021-12-12 File sachithrabandara49@gmail.com"};
        GetEndDate getEndDate=new GetEndDate(args);
        //verify that the detailReport object is an instance of GetEndDate class
        assertThat(getEndDate,instanceOf(GetEndDate.class));

    }





}