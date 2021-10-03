package com.kelaniya.uni.g5.inputs;

import com.kelaniya.uni.g5.inputs.GetStartDate;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetStartDateTest {

    @Test
    public void should_return_GetStartDate_object(){
        String []args={"Summary 2012-12-12 2021-12-12 File sachithrabandara49@gmail.com"};
        GetStartDate getStartDate=new GetStartDate(args);
        //verify that the getStartDate object is an instance of GetStartDate class
        assertThat(getStartDate,instanceOf(GetStartDate.class));

    }

}