package com.example.contact_eos_2021;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(){}

    public  Contact(String phoneNumber, String name){
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
