package com.kelaniya.uni.g5.ui;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class CmdLineUITest {

    @Test
    public void should_return_CmdLineUI_object(){


        CmdLineUI cmdLineUI=new CmdLineUI();
        assertThat(cmdLineUI,instanceOf(CmdLineUI.class));


    }



}