package com.example.demo.sendingEmail;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class NetConnectionChecker {
    public boolean netIsAvailable() {
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
