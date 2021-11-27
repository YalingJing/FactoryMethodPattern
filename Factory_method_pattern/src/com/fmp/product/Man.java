package com.fmp.product;

public class Man implements Person{

    public Man(){}

    @Override
    public void makePeople() {
        System.out.println("生产男人");
    }
}