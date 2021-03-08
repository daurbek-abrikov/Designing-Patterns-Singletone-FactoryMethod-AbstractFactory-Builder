package com.company.factory;

public class RoadLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
