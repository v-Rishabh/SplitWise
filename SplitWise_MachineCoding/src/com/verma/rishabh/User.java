package com.verma.rishabh;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String userName;
    private String eMail;
    private ArrayList<Expense> paid;
    private ArrayList<Expense> borrowed;
    private double balance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(eMail, user.eMail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, eMail);
    }

    // Constructor
    User(String userName, String eMail){
        this.userName = userName;
        this.eMail = eMail;
        this.balance = 0;
        this.paid = new ArrayList<>();
        this.borrowed = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public String geteMail() {
        return eMail;
    }

    public double getPaid() {
        //return paid;
        double paidSum = 0.00;
        for(Expense e : paid){
            paidSum += e.getAmount();
        }
        return paidSum;
    }

    public double getBorrowed() {
        //return borrowed;
        double borrowedSum = 0.00;
        for(Expense e : borrowed){
            borrowedSum += e.getShare();
        }
        return borrowedSum;
    }

    public double getBalance() {
        return balance;
    }

    public void addPayment(Expense paymentObj, double moneyLent){
        paid.add(paymentObj);
        balance += moneyLent;
    }

    public void addBorrowed(Expense borrowedObj, double moneyBorrowed){
        borrowed.add(borrowedObj);
        balance -= moneyBorrowed;
    }
}
