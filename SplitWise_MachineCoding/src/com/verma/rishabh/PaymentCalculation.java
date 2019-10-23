package com.verma.rishabh;

import java.util.ArrayList;

public class PaymentCalculation {
    public void calculateEqualPartition(Expense expense, User userWhoPaid, ArrayList<User> listOfUsers){
        int totalUsers = listOfUsers.size();
        double equalShare = expense.getAmount() / totalUsers;
        double moneyLent = (equalShare * (totalUsers - 1));
        userWhoPaid.addPayment(expense,moneyLent);

        for(User u : listOfUsers){
            if(u.getUserName().equals(userWhoPaid.getUserName())){
                continue;
            }
            else{
                u.addBorrowed(expense,equalShare);
            }
        }
    }
}
