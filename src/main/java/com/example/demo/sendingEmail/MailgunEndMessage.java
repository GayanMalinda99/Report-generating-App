package com.example.demo.sendingEmail;

public class MailgunEndMessage implements  EndMessage{
    public String showEndText(String text){

       if (text.equals("{\"message\":\"'to' parameter is not a valid address. please check documentation\"}")){
           return "Email not send. Not a valid email address" ;
       }else if(text.equals("{\"message\":\"Sandbox subdomains are for test purposes only. Please add your own " +
               "domain or add the address to authorized recipients in Account Settings.\"}")){
           return "Email not send. Not a verified email address" ;
       }else{
           return "Email sent successfully" ;
       }
    }
}
