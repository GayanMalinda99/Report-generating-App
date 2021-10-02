package com.kelaniya.uni.g5.storingAndSending;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class EmailSenderTest {
    
@Test
public void should_return_EmailSender_object_when_input_is_email(){

    EmailSender emailSender=new EmailSender();
    //verify that the emailSender object is an instance of EmailSender class
    assertThat(emailSender,instanceOf(EmailSender.class));

}




}