package com.fmp.factory;


import com.fmp.product.Person;
import com.fmp.product.Woman;

public class WomanPersonFactory implements nvwaFactory{
    public WomanPersonFactory(){}

    @Override
    public Person createPerson() {
        Person p;
        p = new Woman();
        return p;
    }
}
