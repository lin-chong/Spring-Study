package com.llt.entity;

public class Account {
    private String name;

    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
