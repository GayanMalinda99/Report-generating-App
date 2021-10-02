package com.kelaniya.uni.v1;

public class GetEmail {
    private final String[] args;

    public GetEmail(String[] arguments) {
        this.args = arguments;
    }

    public String getEmail(){

        String email = args[4];
        String type= "^.+@.+$";

        if (!email.matches(type)) {
            System.out.println("Please provide the correct email as argument");
            return "";
        }
        return email;
    }
}
