package com.lbg.unittesting;

public class Bank {

    private String firstname, lastname;
    public Bank(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getAccountHolderName(){
        return firstname + " " + lastname;
    }
}
