package com.company;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Rob");

        ArrayList<Integer> intArrayList = new ArrayList<>();
        // Autoboxing to change primitive type to wrapper class
        intArrayList.add(Integer.valueOf(54));

        // Unboxing to change wrapper class to primitive type.
        System.out.println(intArrayList.get(0).intValue());


    }
}
