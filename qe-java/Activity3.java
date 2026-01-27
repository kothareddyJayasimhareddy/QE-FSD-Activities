package com;

public class Activity3 {
        
      
    public static void main(String[] args) {
        double sec = 100_000_000;
        double EarthSec = 31557600;
        double MercurySec = 0.2488467;
        double VenusSec = 6.61519726;
        double MarsSec = 1.8888158;
        double JupiterSec = 11.862615;
        double SaturnSec = 29.447495;
        double UranusSec = 84.016846;
        double NeptuneSec = 164.79132;

        double age = (sec/EarthSec);
        System.out.printf("%.2f");
    }

    // public static double calculateAge(double age){
    //     return age/EarthSec;
    // }
}
