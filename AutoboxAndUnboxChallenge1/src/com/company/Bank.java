package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private int findBranch(Branch branch){
        return branches.indexOf(branch);
    }

    private int findBranch(String name){
        for(int i = 0; i<branches.size();i++){
            if(branches.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean addBranch(Branch branch){
        if(findBranch(branch)>=0){
            System.out.println(branch.getName()+ " branch already exists");
            return false;
        }
        branches.add(branch);
        System.out.println(branch.getName() + " branch has been added");
        return true;
    }

    public boolean addCustomer(String branchName, String newCustomerName, double initialBalance){
        int branchLocation = findBranch(branchName);
        if(branchLocation >= 0){
//            var newCustomer = Customer.createCustomer(newCustomerName,initialBalance);
//            branches.get(branchLocation).addCustomer(newCustomer);
//            System.out.println(newCustomer.getName()+ " added to the "+branchName+" branch.");
            return branches.get(branchLocation).addCustomer(Customer.createCustomer(newCustomerName,initialBalance));
        }
        System.out.println(branchName +" branch not found.");
        return false;
    }

    public void addTransaction(Branch branch, String customerName, double amount){
        int branchLocation = findBranch(branch);
        if(branchLocation >= 0){
            int index = branch.findCustomer(customerName);
            branches.get(branchLocation).getCustomers().get(index).addTransaction(amount);
            System.out.println(amount + " has been added to transactions.");
        }
    }

    public void showListOfCustomers(String nameOfBranch, boolean includeTransactions){
        int branchLocation = findBranch(nameOfBranch);
        if(branchLocation>=0){
            System.out.println("List of Customers for "+ nameOfBranch + " branch.");
            for(int i = 0;i<branches.get(branchLocation).getCustomers().size();i++){
                Customer customer = branches.get(branchLocation).getCustomers().get(i);
                System.out.println("Customer " +(i+1)+ ". "+ customer.getName());
                if(includeTransactions){
                    customer.getTransactions();
                }
            }
        }
    }

    public void showBranches(){
        System.out.println("All Branches");
        for(int i = 0;i<branches.size();i++){
            System.out.println((i+1)+ ". " + branches.get(i).getName());
        }
    }


}
