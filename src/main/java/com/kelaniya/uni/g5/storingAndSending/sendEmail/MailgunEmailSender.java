package com.kelaniya.uni.g5.storingAndSending.sendEmail;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;

import java.io.File;

public class MailgunEmailSender implements EmailSender {
    private final String YOUR_DOMAIN_NAME = "sandbox2210c82599094d47b68180f24547098b.mailgun.org";
    private final String API_KEY = "c29c77f3bbe9210c09ee1ba1cd445e65-dbdfb8ff-d51f4f9c";
    private final String sender = "issiwaraperera9912@gmail.com";
    private final String filePath;

    public MailgunEmailSender(String filePath){
        this.filePath = filePath ;
    }

    public String sendEmail(String email ) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + YOUR_DOMAIN_NAME + "/messages")
                .basicAuth("api", API_KEY)
                .queryString("from", sender)
                .queryString("to", email)
                .queryString("subject", "Report")
                .queryString("text", "Report")
                .field("attachment", new File(filePath))
                .asJson();
        return request.getBody().toString();

    }


}
