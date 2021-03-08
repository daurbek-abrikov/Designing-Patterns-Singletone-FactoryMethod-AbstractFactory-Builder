package com.company.abstractFactory.Victorian;

import com.company.abstractFactory.Chair;
import com.company.abstractFactory.CoffeeTable;
import com.company.abstractFactory.FurnitureFactory;
import com.company.abstractFactory.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
