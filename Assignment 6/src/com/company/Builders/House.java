package com.company.Builders;

public class House {
    private final materialType material;
    private final int walls;
    private final int doors;
    private final int windows;
    private final roofType roof;
    private final garageType garage;
    private final int rooms;

    public House(materialType material,int walls,int doors,int windows,roofType roof,garageType garage,int rooms) {
        this.material = material;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
        this.rooms = rooms;
    }

    public materialType getMaterialType() {
        return material;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public roofType getRoof() {
        return roof;
    }

    public garageType getGarage() {
        return garage;
    }

    public int getRooms() {
        return rooms;
    }
}
