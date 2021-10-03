package com.kelaniya.uni.g5.inputs.IO;

import com.kelaniya.uni.g5.inputs.InvalidInputException;
import com.kelaniya.uni.g5.reports.DetailedReport;
import org.junit.Assert;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class GetEmailTest {
    @Test
    public void testGetEmail(){
        String []args={"Summary 2012-12-12 2021-12-12 File sachithrabandara49@gmail.com"};
        String email = args[4];
        GetEmail getEmail=new GetEmail(args);
        Assert.assertEquals("sachithrabandara49@gmail.com",getEmail.getEmail());

    }


    @Test
    public void should_return_GetEmail_object_when_type_matches_email(){
        String []args={"Summary 2012-12-12 2021-12-12 File sachithrabandara49@gmail.com"};
        GetEmail getEmail=new GetEmail(args);
        String email = args[4];
        String type= "^.+@.+$";
        assertEquals(email.matches(type),getEmail.getEmail().matches(type));

    }

    @Test
    public void should_return_GetEmail_object(){
        String []args={"Summary 2012-12-12 2021-12-12 File sachithrabandara49@gmail.com"};
        GetEmail getEmail=new GetEmail(args);
        //verify that the getEmail object is an instance of GetEmail class
        assertThat(getEmail,instanceOf(GetEmail.class));

    }







}