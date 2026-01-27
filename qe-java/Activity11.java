package com;

import java.util.HashMap;
import java.util.Map;


public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> colors = new HashMap<>();
        colors.put(1,"red");
        colors.put(2,"green");
        colors.put(3,"blue");
        colors.put(4,"black");
        colors.put(5,"yellow");

        System.out.println(colors);
        System.out.println("Removing Color-Red: "+colors.entrySet().removeIf(e -> e.getValue().equals("red")));
        System.out.println("Is color Green present in colors: "+colors.containsValue("green"));
        System.out.println("Size of the map: "+colors.size());

    }
}
