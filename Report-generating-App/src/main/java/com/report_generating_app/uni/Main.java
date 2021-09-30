package com.report_generating_app.uni;

import kong.unirest.JsonNode;

public class Main {
    public static void main(String[] args) {
        Emails email = new Emails() ;
        JsonNode jsonNode =  email.sendSimpleMessage() ;
        System.out.println(jsonNode.toString());
    }

}
