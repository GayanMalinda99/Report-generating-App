package main.java.com.kelaniya.uni.g5;

import java.mail.Authenticator;
import java.util.Properties;

public class SendMail {
    
    public static void sendMails(String recipient) {

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "gayan1999malinda@gmail.com";
        String password = "xxxxxx";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        Message message = prepareMessage(session);
        Transport.send(message);
        System.out.println("Message sent successfully");

    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient){
        try {
            Message message = new myMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipeant(Message.RecipeantType.TO, new InternetAddress(recepient));
            message.setSubject("Hello");
            message.setText("Hey...\n Look my email");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    
}
