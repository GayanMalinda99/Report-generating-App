package com.kelaniya.uni.g5.inputs;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


public class GetEmailTest {

    @Test
    public void should_return_GetEmail_object(){
        String []args={"Summary 2012-12-12 2021-12-12 File sachithrabandara49@gmail.com"};
        GetEmail getEmail=new GetEmail(args);
        //verify that the getEmail object is an instance of GetEmail class
        assertThat(getEmail,instanceOf(GetEmail.class));

    }

}