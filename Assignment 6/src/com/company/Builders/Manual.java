package com.company.Builders;

public class Manual {
    private final materialType material;
    private final int walls;
    private final int doors;
    private final int windows;
    private final roofType roof;
    private final garageType garage;
    private final int rooms;

    public Manual(materialType material,int walls,int doors,int windows,roofType roof,garageType garage,int rooms) {
        this.material = material;
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
        this.rooms = rooms;
    }

    public String print() {
        String info = "";
        info += "Type of material: " + material + "\n";
        info += "Count of walls: " + walls + "\n";
        info += "Count of doors: " + doors + "\n";
        info += "Count of windows: " + windows + "\n";
        info += "Type of roof: " + roof + "\n";

        if (this.garage != null) {
            info += "Type of garage:"+ garage+ "\n";
        } else {
            info += "No garage" + "\n";
        }
        return info;
    }
}
