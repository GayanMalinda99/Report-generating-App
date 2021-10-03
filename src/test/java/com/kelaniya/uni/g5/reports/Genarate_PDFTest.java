package com.kelaniya.uni.g5.reports;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class Genarate_PDFTest {


    @Test
    public void should_return_Generate_PDF_object(){

        Genarate_PDF genarate_pdf=new Genarate_PDF();
        //verify that generate_PDF object is an instance of Generate_PDF class
        assertThat(genarate_pdf,instanceOf(Genarate_PDF.class));

    }

}