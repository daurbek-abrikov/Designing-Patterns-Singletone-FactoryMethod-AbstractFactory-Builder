package com.company.Builders;

public class TestBuilders {
    public static void main(String[] args) {
        Director director = new Director();


        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        HouseBuilder builder = new HouseBuilder();
        director.constructCastle(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        House house = builder.getResult();
        System.out.println("House built material:\n" + house.getMaterialType());


        HouseManualBuilder manualBuilder = new HouseManualBuilder();

        // Director may know several building recipes.
        director.constructCastle(manualBuilder);
        Manual houseManual = manualBuilder.getResult();
        System.out.println("\nHouse manual built:\n" + houseManual.print());
    }


}
