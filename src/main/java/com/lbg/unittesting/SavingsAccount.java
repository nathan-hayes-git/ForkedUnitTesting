package com.lbg.unittesting;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SavingsAccount extends Bank {
    private double deposit;
    private double duration;
    private double interestRate;


    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    public SavingsAccount(String firstname, String lastname, double deposit, double interestRate, double duration, String despositDate) {
        super(firstname, lastname);
        this.setDeposit(deposit);
        this.setInterestRate(interestRate);
        this.setDuration(duration);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar compoundingDate = Calendar.getInstance();
        try {
            compoundingDate.setTime(dateFormat.parse(despositDate));
        } catch (ParseException excep) {
            excep.printStackTrace();
        }
        compoundingDate.add(Calendar.DAY_OF_MONTH, 365);
        String modifiedDate = dateFormat.format(compoundingDate.getTime());
//        System.out.println("The Modified Date is: " + modifiedDate);


    }

    public double amountAfterInterest(double principal, double rate, double years) {
        rate = rate / 100; // Convert percentage to a decimal
        return principal * Math.pow((1 + rate), years);
    }
}




















