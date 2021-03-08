package com.company.abstractFactory.Modern;

import com.company.abstractFactory.Chair;
import com.company.abstractFactory.CoffeeTable;
import com.company.abstractFactory.FurnitureFactory;
import com.company.abstractFactory.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
