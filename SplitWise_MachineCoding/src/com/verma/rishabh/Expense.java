package com.verma.rishabh;

import java.util.Date;

public class Expense {
    private static int expenseId = 0;
    private String title;
    private Date timestamp;
    private double amount;
    private String paidBy;

    public double getShare() {
        return share;
    }

    private double share;

    Expense(String title,User paidBy,double amount,int userCount){
        this.title = title;
        this.paidBy = paidBy.getUserName();
        this.amount = amount;
        expenseId++;
        this.timestamp = new Date();
        this.share = amount/userCount;
    }

    public static int getExpenseId() {
        return expenseId;
    }

    public String getTitle() {
        return title;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaidBy() {
        return paidBy;
    }
}
