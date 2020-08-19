package com.company;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;


    public VipCustomer(){
        this("Default name", 0,"Default email");
    }


    public VipCustomer(String name, int creditLimit){
        this(name,creditLimit,"Default email");
    }


    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }




    public String getName() {
        return name;
    }


    public int getCreditLimit(){
        return creditLimit;
    }


    public String getEmailAddress(){
        return emailAddress;
    }

}
