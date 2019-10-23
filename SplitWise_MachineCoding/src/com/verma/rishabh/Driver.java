package com.verma.rishabh;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args){
        System.out.println("====== Details ======");

        ArrayList<User> listOfUsers = new ArrayList<>();

        // Create Users
        User user1 = new User("Rishabh","1@gmail.com");
        User user2 = new User("Rishi","2@gmail.com");
        User user3 = new User("RV","3@gmail.com");

        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);

        // Create Expense
        Expense expense1 = new Expense("Drinks",user1,3544.00,listOfUsers.size());
        Expense expense2 = new Expense("Lunch",user2,1500.00,listOfUsers.size());
        Expense expense3 = new Expense("Cab",user3,1000.00,listOfUsers.size());
        Expense expense4 = new Expense("Lunch",user2,600.00,listOfUsers.size());
        Expense expense5 = new Expense("Lunch",user2,380.00,listOfUsers.size());

        // Payment Calculation
        PaymentCalculation paymentCalculation = new PaymentCalculation();
        paymentCalculation.calculateEqualPartition(expense1,user1,listOfUsers);
        paymentCalculation.calculateEqualPartition(expense2,user2,listOfUsers);
        paymentCalculation.calculateEqualPartition(expense3,user3,listOfUsers);
        paymentCalculation.calculateEqualPartition(expense4,user2,listOfUsers);
        paymentCalculation.calculateEqualPartition(expense5,user2,listOfUsers);

        // printing balance
        for(User u : listOfUsers){
            if(u.getBalance() > 0){
                System.out.println(u.getUserName()+" GETS Back: "+(double) Math.round(u.getBalance() * 100) / 100+", Borrowed: "+(double) Math.round(u.getBorrowed() * 100) / 100+", Paid: "+(double) Math.round(u.getPaid()* 100) / 100);
            }
            else{
                System.out.println(u.getUserName()+", OWES : "+(double) Math.round(u.getBalance() * 100) / 100+", Borrowed: "+(double) Math.round(u.getBorrowed() * 100) / 100+", Paid: "+(double) Math.round(u.getPaid()* 100) / 100);
            }

        }
    }
}
