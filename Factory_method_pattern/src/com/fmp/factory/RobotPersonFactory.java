package com.fmp.factory;

import com.fmp.product.Person;
import com.fmp.product.Robot;

public class RobotPersonFactory implements nvwaFactory{
    public RobotPersonFactory(){}

    @Override
    public Person createPerson() {
        Person p;
        p = new Robot();
        return p;
    }
}
