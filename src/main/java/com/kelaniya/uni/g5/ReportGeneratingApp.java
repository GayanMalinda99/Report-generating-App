package com.kelaniya.uni.g5;

import com.kelaniya.uni.g5.inputs.*;
import com.kelaniya.uni.g5.reports.DetailedReport;
import com.kelaniya.uni.g5.reports.SummaryReport;
import com.kelaniya.uni.g5.storingAndSending.EmailSendingOperation;
import com.kelaniya.uni.g5.storingAndSending.endMessage.EndMessage;
import com.kelaniya.uni.g5.storingAndSending.endMessage.MailgunEndMessage;
import com.kelaniya.uni.g5.storingAndSending.sendEmail.EmailSender;
import com.kelaniya.uni.g5.storingAndSending.sendEmail.MailgunEmailSender;
import com.kelaniya.uni.g5.ui.CmdLineUI;
import com.kelaniya.uni.g5.ui.UI;

public class ReportGeneratingApp {

    private final GetReportType reportType;
    private final GetStartDate startDate;
    private final GetEndDate endDate;
    private final GetRequestMethod requestMethod;
    private final GetEmail getEmail;

    public ReportGeneratingApp(GetReportType reportType, GetStartDate startDate, GetEndDate endDate, GetRequestMethod requestMethod, GetEmail getEmail) {
        this.reportType = reportType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.requestMethod = requestMethod;
        this.getEmail = getEmail;
    }


    public void execute()
    {
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
        else
        {

        }
    }
}
