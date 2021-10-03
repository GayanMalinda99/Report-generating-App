package com.kelaniya.uni.g5.inputs.IO;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class GetRequestMethodTest {

    @Test
    public void should_return_GetRequestMethod_object(){
        String []args={"Summary 2012-12-12 2021-12-12 File sachithrabandara49@gmail.com"};
        GetRequestMethod getRequestMethod=new GetRequestMethod(args);
        //verify that the getRequestMethodTest object is an instance of GetRequestMethod class
        assertThat(getRequestMethod,instanceOf(GetRequestMethod.class));

    }




}
