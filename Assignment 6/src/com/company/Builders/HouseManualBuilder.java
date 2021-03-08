package com.company.Builders;

public class HouseManualBuilder implements Builder{
    private materialType material;
    private int walls;
    private int doors;
    private int windows;
    private roofType roof;
    private garageType garage;
    private int rooms;

    @Override
    public void setMaterialType(materialType material) {
        this.material=material;
    }

    @Override
    public void setWalls(int walls) {
        this.walls=walls;
    }

    @Override
    public void setDoors(int doors) {
        this.doors=doors;
    }

    @Override
    public void setWindows(int windows) {
        this.windows=windows;
    }

    @Override
    public void setRoof(roofType roof) {
        this.roof=roof;
    }

    @Override
    public void setGarage(garageType garage) {
        this.garage=garage;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms=rooms;
    }

    public Manual getResult() {
        return new Manual(material,walls,doors,windows,roof,garage,rooms);
    }
}
