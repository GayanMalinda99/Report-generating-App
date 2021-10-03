package com.kelaniya.uni.g5.storingAndSending.endMessage;

public class MailgunEndMessage implements  EndMessage{
    public String showEndText(String emailEndText){

        System.out.println(emailEndText);
       if (emailEndText.equals("{\"message\":\"'to' parameter is not a valid address. please check documentation\"}")){
           return "Email not send. Not a valid email address" ;
       }else if(emailEndText.equals("{\"message\":\"Sandbox subdomains are for test purposes only. Please add your own " +
               "domain or add the address to authorized recipients in Account Settings.\"}")){
           return "Email not send. Not a verified email address" ;
       }else{
           return "Email sent successfully" ;
       }
    }
}
