package com.example.demo;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import java.io.File;
import java.util.Scanner;

public class EmailSender {
    private  final String YOUR_DOMAIN_NAME = "sandboxda9c4b996ef341898279b43c284bd6c0.mailgun.org";
    private  final String API_KEY = "4ac88df3a5f251caaf471f91c1e5d18a-dbdfb8ff-8ca2f010";


    public String getEmail(){
        System.out.println("Enter the email address");
        Scanner scanner = new Scanner(System.in) ;
        String email = scanner.nextLine() ;
        return email ;
    }

    public JsonNode sendSimpleMessage(String email) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + YOUR_DOMAIN_NAME + "/messages")
			.basicAuth("api", API_KEY)
                .queryString("from", "softwareconstructionteam5@gmail.com")
                .queryString("to", email)
                .queryString("subject", "Report")
                .queryString("text", "Report")
                .field("attachment", new File("Report.xlsx"))
                .asJson();
        return request.getBody();
    }
}
