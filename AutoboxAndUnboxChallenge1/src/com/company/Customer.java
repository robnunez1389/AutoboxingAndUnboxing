package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transactionAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(transactionAmount);
    }

    public String getName() {
        return name;
    }

    public void getTransactions() {
        System.out.println("Transactions listed below: ");
        for(int i = 0;i<transactions.size();i++){
            System.out.println((i+1)+ ". "+ transactions.get(i));
        }
    }

    public void addTransaction(double amount){
        transactions.add(amount);
    }


    public static Customer createCustomer(String name, double transactionAmount){
        return new Customer(name, transactionAmount);
    }


}
