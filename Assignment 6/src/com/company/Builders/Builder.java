package com.company.Builders;

public interface Builder {
    void setMaterialType(materialType material);
    void setWalls(int walls);
    void setDoors(int doors);
    void setWindows(int windows);
    void setRoof(roofType roof);
    void setGarage(garageType garage);
    void setRooms(int rooms);
}
