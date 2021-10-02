package com.example.demo.sendingEmail;

import com.example.demo.sendingEmail.endMessage.EndMessage;
import com.example.demo.sendingEmail.sendEmail.EmailSender;
import com.example.demo.ui.UI;

public class EmailSendingOperation {

    private final EmailAddressGetter emailAddressGetter;
    private final EmailSender emailSender;
    private final EndMessage endMessage;
    private final UI ui;

    public EmailSendingOperation(EmailAddressGetter emailAddressGetter, EmailSender emailSender,
                                 EndMessage endMessage, UI ui) {

        this.emailAddressGetter = emailAddressGetter;
        this.emailSender = emailSender;
        this.endMessage = endMessage;
        this.ui = ui;
    }

    public void execute(){

        String userEmailAddress = emailAddressGetter.getEmail();
        String emailStatus = emailSender.sendEmail(userEmailAddress);
        String emailEndMessage = endMessage.showEndText(emailStatus) ;
        ui.showMessage(emailEndMessage);
    }
}
