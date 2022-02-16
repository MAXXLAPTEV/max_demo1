package com.example.max_demo1.dto;

import lombok.Data;


public class Car {
    public Car(int num, int price, String name) {
        this.num = num;
        this.price = price;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int num;
    private int price;
    private String name;
}


