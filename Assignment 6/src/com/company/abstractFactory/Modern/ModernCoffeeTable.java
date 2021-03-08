package com.company.abstractFactory.Modern;

import com.company.abstractFactory.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void holdsCoffee() {
        System.out.println("Modern coffee table holds your Coffee. ");
    }
}
