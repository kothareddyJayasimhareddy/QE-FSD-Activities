package com;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("jay");
        list.add("Simha");
        list.add("ram");
        list.add("ravi");
        list.add("raj");

        for(String s : list){
            System.out.println(s);
        }
        
        String name = list.get(2);
        boolean isContains = list.contains("ram");
        System.out.println(list.size());
        list.remove("raj");
        System.out.println(list.size());
    }
}
