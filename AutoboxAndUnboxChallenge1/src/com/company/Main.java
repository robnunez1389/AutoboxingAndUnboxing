package com.company;

public class Main {

    public static void main(String[] args) {
        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions


        Bank bank  = new Bank("Nuñez Bank");
        Branch branch = new Branch("Summerville");;
        bank.addBranch(branch);
        bank.addCustomer("Summerville","Brittany", 4500.80);
        bank.showListOfCustomers("Summerville",true);
        bank.addBranch(Branch.createBranch("Cane Bay"));
        bank.showBranches();
        bank.addCustomer("Cane Bay", "Maliah", 22.33);
        bank.showListOfCustomers("Cane Bay", true);
        Branch newBranch = Branch.createBranch("Nexton");
        newBranch.addCustomer(Customer.createCustomer("Marleigh", 4.98));
        bank.showBranches();
        bank.addBranch(newBranch);
        bank.showBranches();
        bank.showListOfCustomers("Nexton", true);
        bank.showListOfCustomers("Summerville", false);
        bank.showListOfCustomers("Cane Bay", true);
        bank.addBranch(Branch.createBranch("Goose Creek"));
        bank.addCustomer("Goose Creek","Jim", 54.07);
        bank.showBranches();






    }
}
