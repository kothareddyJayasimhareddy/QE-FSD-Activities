package com;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    public Car(){
        tyres = 4;
        doors = 4;
    }
    public void displayCharacteristics(){
        System.out.println("Characteristics of the Car");
        System.out.println("Color: "+ make+"\nTransmission: "+transmission+ "\nMake: "+make+"\nTyres: "+ tyres+"\nDoors: "+doors);
    }
    public void accelerate(){
        System.out.println("Car is moving forward.");
    }
    public void brake(){
        System.out.println("Car has Stopped.");
    }
}
