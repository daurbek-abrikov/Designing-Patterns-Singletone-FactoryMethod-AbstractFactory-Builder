package com.company.abstractFactory.Victorian;

import com.company.abstractFactory.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void holdsCoffee() {
        System.out.println("Victorian coffee table holds your Coffee. ");
    }
}
