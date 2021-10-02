package com.kelaniya.uni.v1;

public class GetRequestMethod {
    private final String[] args;

    public GetRequestMethod(String[] arguments) {
        this.args = arguments;
    }

    public String getRequsetMethod(){

        String requsetMethod = args[3];
        if (!(requsetMethod.equals("Email") || requsetMethod.equals("File"))) {
            System.out.println("Please provide the correct report requset method as argument");
            return "";
        }
        return requsetMethod;
    }
}
