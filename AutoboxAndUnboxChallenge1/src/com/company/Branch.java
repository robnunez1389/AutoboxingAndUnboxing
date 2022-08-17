package com.company;

import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private int findCustomer(Customer customer){
        return customers.indexOf(customer);
    }

    public int findCustomer(String name){
        for(int i = 0; i< customers.size();i++){
            if(name.equals(customers.get(i).getName())){
                return i;
            }
        }
        return -1;
    }

    public boolean addCustomer(Customer customer){
        if (findCustomer(customer) >= 0){
            System.out.println("Customer ("+ customer.getName()+ ") is already a customer.");
            return false;
        }
        customers.add(customer);
        System.out.println("Customer "+ customer.getName() + " added to " + this.name);
        return true;
    }


    public static Branch createBranch(String name){
        return new Branch(name);
    }


}
