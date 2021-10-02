package com.kelaniya.uni.g5.storingAndSending;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class EmailSender {
    private  final String DOMAIN_NAME = "sandboxda9c4b996ef341898279b43c284bd6c0.mailgun.org";
    private  final String API_KEY = "4ac88df3a5f251caaf471f91c1e5d18a-dbdfb8ff-8ca2f010";
    private  final String[] verfiedEmails = {"tharakaariyarathna04@gmail.com"} ;
   // private final String[] VerfiedEmails={"sachithrabandara49@gmail.com"};

    public String getEmail(){
        System.out.println("Enter the email address");
        Scanner scanner = new Scanner(System.in) ;
        String email = scanner.nextLine() ;
        return email ;
    }


    public boolean verifyEmail(String userEmail){
        if(userEmail.equals(verfiedEmails[0])){
            return true ;
        }else{
            return false ;
        }
    }

    public JsonNode sendSimpleMessage(String email) throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + DOMAIN_NAME + "/messages")
                .basicAuth("api", API_KEY)
                .queryString("from", "softwareconstructionteam5@gmail.com")
                .queryString("to", email)
                .queryString("subject", "Report")
                .queryString("text", "Report")
                .field("attachment", new File("E:\\Desktop\\SCGroup\\GenaratePDF\\report.pdf"))
                .asJson();
        return request.getBody();
    }

    public  boolean netIsAvailable() {
        try {
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
