package com;

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (a,b) -> (a+b);
        Addable ad2 = (a,b) -> {
            return a+b;
        };

        System.out.println(ad1.add(5,5)+" "+ad2.add(5,5));
    }
}

interface Addable{
    public int add(int num1, int num2);
}
