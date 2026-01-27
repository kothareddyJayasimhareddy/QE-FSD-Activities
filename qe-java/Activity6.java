package com;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onBoard("jay");
        plane.onBoard("Simha");
        System.out.println(plane.takeOff());
        System.out.println(plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println(plane.getlastTimeLanded());

    }
}

class Plane{
    private List<String> passengers;
    private int maxPassengers;
    public Date lastTimeTookof;
    private LocalDateTime lastTimeLanded;
    public Plane(int maxPassengers){
        this.maxPassengers = maxPassengers;
        passengers = new ArrayList<String>();
    }
    public void onBoard(String s){
        passengers.add(s);
    }
    public LocalDateTime takeOff(){
        return LocalDateTime.now();
    }
    public void land(){
        lastTimeLanded = LocalDateTime.now();
    }
    public LocalDateTime getlastTimeLanded(){
        return lastTimeLanded;
    }

    public List<String> getPassengers(){
        return passengers;
    }

}
