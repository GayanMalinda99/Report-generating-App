package com.report_generating_app.uni;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;

public class Emails {

    private static final String YOUR_DOMAIN_NAME = "sandboxda9c4b996ef341898279b43c284bd6c0.mailgun.org";
    private static final String API_KEY = "4ac88df3a5f251caaf471f91c1e5d18a-dbdfb8ff-8ca2f010" ;

    public static JsonNode sendSimpleMessage() throws UnirestException {
        HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + YOUR_DOMAIN_NAME + "/messages")
			.basicAuth("api", API_KEY)
                .queryString("from", "softwareconstructionteam5@gmail.com")
                .queryString("to", "tharakaariyarathna04@gmail.com")
                .queryString("subject", "Test")
                .queryString("text", "Works fine")
                .asJson();
        return request.getBody();
    }
}
