package com.company.factory;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        System.out.println("Enter the method of transportation(Ship/Truck):");
        Scanner sc = new Scanner(System.in);
        Logistics logic = createTransportByType(sc.next());
        Transport transport = logic.createTransport();

        transport.deliver();
    }
        static Logistics createTransportByType(String type){
            if(type.equalsIgnoreCase("Ship")){
                return new SeaLogistics();
            }else if(type.equalsIgnoreCase("Truck")){
                return new RoadLogistics();
            }else throw new RuntimeException(type+" is unknown type of transport. ");
        }


}
