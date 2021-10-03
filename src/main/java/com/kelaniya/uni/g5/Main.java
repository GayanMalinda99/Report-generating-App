package com.kelaniya.uni.g5;

import com.kelaniya.uni.g5.inputs.*;
import com.kelaniya.uni.g5.inputs.*;
import com.kelaniya.uni.g5.reports.DetailedReport;
import com.kelaniya.uni.g5.reports.SummaryReport;
import com.kelaniya.uni.g5.storingAndSending.sendEmail.EmailSender;
import com.kelaniya.uni.g5.storingAndSending.EmailSendingOperation;
import com.kelaniya.uni.g5.storingAndSending.endMessage.EndMessage;
import com.kelaniya.uni.g5.storingAndSending.endMessage.MailgunEndMessage;
import com.kelaniya.uni.g5.storingAndSending.sendEmail.MailgunEmailSender;
import com.kelaniya.uni.g5.ui.CmdLineUI;
import com.kelaniya.uni.g5.ui.UI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException  {


        GetReportType reportType = new GetReportType(args);
        GetStartDate startDate = new GetStartDate(args);
        GetEndDate endDate = new GetEndDate(args);
        GetRequestMethod requestMethod = new GetRequestMethod(args);
        GetEmail getEmail = new GetEmail(args);


         System.out.println(reportType.validateType());

        if (reportType.validateType().equals("Summery"))

        
        {
            SummaryReport summaryReport = new SummaryReport();

            summaryReport.execute(startDate.getStartDate(), endDate.getEndDate());

        }
        else if (reportType.validateType().equals("Detailed"))
        {
            DetailedReport detailedReport=new DetailedReport();

            detailedReport.execute(startDate.getStartDate(),endDate.getEndDate());

        }
        else
        {
            System.out.println("Invalid Argument for Report Type");
        }

        if(requestMethod.getRequsetMethod().equals("Email"))
        {

            EmailSender emailSender = new MailgunEmailSender("E:\\Desktop\\SCGroup\\GenaratePDF\\report.pdf");
            EndMessage endMessage = new MailgunEndMessage();
            UI ui = new CmdLineUI() ;
            EmailSendingOperation emailSendingOperation = new EmailSendingOperation(getEmail,emailSender,
                    endMessage,ui) ;
            emailSendingOperation.execute();


        }


    }
}
