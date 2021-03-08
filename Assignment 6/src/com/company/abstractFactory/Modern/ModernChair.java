package com.company.abstractFactory.Modern;

import com.company.abstractFactory.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern Chair has 4 legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on it.");
    }
}
