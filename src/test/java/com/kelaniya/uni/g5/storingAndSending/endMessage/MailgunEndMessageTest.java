package com.kelaniya.uni.g5.storingAndSending.endMessage;

import com.kelaniya.uni.g5.ui.CmdLineUI;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class MailgunEndMessageTest {


    @Test
    public void should_return_MailgunEndMessage_object(){


        CmdLineUI cmdLineUI=new CmdLineUI();
        MailgunEndMessage mailgunEndMessage=new MailgunEndMessage();

        assertThat(mailgunEndMessage,instanceOf(MailgunEndMessage.class));


    }

}