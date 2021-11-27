package com.fmp.factory;

import com.fmp.product.Man;
import com.fmp.product.Person;

public class ManPersonFactory implements nvwaFactory{
    public ManPersonFactory(){}

    @Override
    public Person createPerson() {
        Person p;
        p = new Man();
        return p;
    }
}
