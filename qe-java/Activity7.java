package com;

public class Activity7 {
    public static void main(String[] args){
        MountainBike mb = new MountainBike(3,0,25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}

interface BicycleParts{
public static final int tyres = 2;
public static final int maxSpeed = 50;
}
interface BicycleOperations{
public void applyBrake(int decrement);
public void speedUp(int increment);
}

class Bicycle implements BicycleOperations,BicycleParts{
    int grears;
    int currentSpeed;
    public Bicycle(){
        int grears = 5;
        int currentSpeed = 10;
    }

    @Override
    public void applyBrake(int decrement) {
        // TODO Auto-generated method stub
       currentSpeed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
       currentSpeed += increment;
    }

    public String bicycleDesc(){
        return("No of grears are: "+ grears +"\nSpeed of bicycle is "+ maxSpeed);
    }
    
}

class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike(int grears, int currentSpeed, int seatHeight){
        super.grears = grears;
        super.currentSpeed = currentSpeed;
        this.seatHeight = seatHeight;
    }

    public void seatHeight(int newHeight){
      seatHeight = newHeight;
    }

    public String bicycleDesc(){
        return("No of grears are: "+ grears +"\nSpeed of bicycle is "+ maxSpeed+"\nSeat Height: "+seatHeight);
    }
}