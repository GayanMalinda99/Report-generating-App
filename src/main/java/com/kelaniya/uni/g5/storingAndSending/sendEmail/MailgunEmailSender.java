package  com.kelaniya.uni.g5.storingAndSending.sendEmail;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;

import java.io.File;

public class MailgunEmailSender implements EmailSender {
    private final String YOUR_DOMAIN_NAME = "sandboxc5d382f298da44a4a6efda73711a7077.mailgun.org";
    private final String API_KEY = "f3f2779e739843979a3577cb8ba557fd-dbdfb8ff-0f0cecf7";
    private final String sender = "issikavinda@gmail.com";
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
