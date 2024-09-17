package com.google.classes;

public class Electric extends Vehicle{

    public int electriId=20;
    public void getModel(){
        System.out.println("IElectric");

    }

    public Electric() {
        System.out.println("IElectric constructor called");

    }
    public String getElectricID(){
        System.out.println("electriId id is "+ electriId);
        return Integer.toString(electriId);
    }
}