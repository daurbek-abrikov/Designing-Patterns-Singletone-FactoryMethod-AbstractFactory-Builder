package com.company.Builders;public class Director {
    public void constructSmallHouse(Builder builder) {
        builder.setMaterialType(materialType.WOOD);
        builder.setWalls(4);
        builder.setDoors(2);
        builder.setWindows(2);
        builder.setRoof(roofType.TRIANGLE_TYPE);
        builder.setRooms(2);
    }
    public void constructCastle(Builder builder) {
        builder.setMaterialType(materialType.STONE);
        builder.setWalls(8);
        builder.setDoors(1);
        builder.setWindows(4);
        builder.setRoof(roofType.RECTANGLE_TYPE);
        builder.setRooms(12);
        builder.setGarage(garageType.BIG_BRIGHT);
    }
    public void constructGoldHouse(Builder builder) {
        builder.setMaterialType(materialType.GOLD);
        builder.setWalls(6);
        builder.setDoors(4);
        builder.setWindows(12);
        builder.setRoof(roofType.RECTANGLE_TYPE);
        builder.setRooms(8);
        builder.setGarage(garageType.SMALL_DARK);
    }
}
