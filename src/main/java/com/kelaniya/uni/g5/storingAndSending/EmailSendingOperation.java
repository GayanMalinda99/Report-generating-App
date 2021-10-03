package com.kelaniya.uni.g5.storingAndSending;

import com.kelaniya.uni.g5.inputs.GetEmail;
import com.kelaniya.uni.g5.storingAndSending.endMessage.EndMessage;
import com.kelaniya.uni.g5.storingAndSending.sendEmail.EmailSender;
import com.kelaniya.uni.g5.ui.UI;


public class EmailSendingOperation {

    private final GetEmail getEmail;
    private final EmailSender emailSender;
    private final EndMessage endMessage;
    private final UI ui;

    public EmailSendingOperation(GetEmail getEmail, EmailSender emailSender,
                                 EndMessage endMessage, UI ui) {

        this.getEmail = getEmail;
        this.emailSender = emailSender;
        this.endMessage = endMessage;
        this.ui = ui;
    }

    public void execute(){




       String userEmailAddress = getEmail.getEmail();
        String emailStatus = emailSender.sendEmail(userEmailAddress);
        String emailEndMessage = endMessage.showEndText(emailStatus) ;
        ui.showMessage(emailEndMessage);


    }
}
