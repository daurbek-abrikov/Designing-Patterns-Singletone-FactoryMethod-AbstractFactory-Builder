package com.company.abstractFactory;

import com.company.abstractFactory.Modern.ModernFurnitureFactory;


public class abstractFactory {
    public static void main(String [] args){

        FurnitureFactory fact = new ModernFurnitureFactory();
        Sofa sofa1 = fact.getSofa();
        Chair chair1 = fact.getChair();
        CoffeeTable coffeeTable1 = fact.getCoffeeTable();

        System.out.println("The Furniture type that you selected is below:\n");
        sofa1.isComfort();
        chair1.hasLegs();
        chair1.sitOn();
        coffeeTable1.holdsCoffee();
    }
}
