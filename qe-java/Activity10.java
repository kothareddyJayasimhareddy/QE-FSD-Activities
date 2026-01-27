package com;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("jay");
        hs.add("Simha");
        hs.add("ram");
        hs.add("ravi");
        hs.add("raj");

        System.out.println("Size of the HashSet: "+ hs.size());
        System.out.println("Removing Raj: " + hs.remove("raj"));
        System.out.println("Removing Suresh: " + hs.remove("suresh"));
        System.out.println("Is HashSet contains Ram: "+hs.contains("ram"));
        System.out.println(hs);
    }
}
