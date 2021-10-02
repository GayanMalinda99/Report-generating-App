package com.kelaniya.uni.v1.ValidateComandLineInputs;

public class ValidateArguments {
    private final String[] args;

    public ValidateArguments(String[] arguments) {
        this.args = arguments;
    }

    static boolean emailValid(String email){
        String type= "^.+@.+$";
        return email.matches(type);
    }

    public String validateType(){

        String reportType = args[0];
        if (!(reportType.equals("Summery") || reportType.equals("Detailed"))) {
            System.out.println("Please provide the correct report type as argument");
            return "";
        }

        return reportType;
    }

    public String getStartDate(){

        String startDate = args[1];
        //YMD
        String[] date=startDate.split("-");
        int year= Integer.parseInt(date[0]);
        int month=Integer.parseInt(date[1]);
        int day=Integer.parseInt(date[2]);

        if (!((year>2000 && year<2022)&&(month>0 && month<13)&&(day>0 && day<32))){
            System.out.println("Please provide the correct start date as argument");
            return "";
        }
        return startDate;
    }
    public String getEndDate(){

        String endDate = args[2];
        //YMD
        String[] date=endDate.split("-");
        int year= Integer.parseInt(date[0]);
        int month=Integer.parseInt(date[1]);
        int day=Integer.parseInt(date[2]);

        if (!((year>2000 && year<2022)&&(month>0 && month<13)&&(day>0 && day<32))){
            System.out.println("Please provide the correct end date as argument");
            return "";
        }
        return endDate;
    }

    public String getRequsetMethod(){

        String requsetMethod = args[3];
        if (!(requsetMethod.equals("Email") || requsetMethod.equals("File"))) {
            System.out.println("Please provide the correct report requset method as argument");
            return "";
        }
        return requsetMethod;
    }

    public String getEmail(){

        String email = args[4];

        if (!emailValid(email)) {
            System.out.println("Please provide the correct email as argument");
            return "";
        }
        return email;
    }



}
