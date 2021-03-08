package com.company.abstractFactory.Victorian;

import com.company.abstractFactory.Chair;

public class VictorianChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair has 3 legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("But you still can sit on it.");
    }
}
