package com;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indxGen = new Random();

        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }

        Integer[] nums = list.toArray(new Integer[0]);
        int indx = indxGen.nextInt(nums.length);
        System.out.println(indx);
        System.out.println(nums[indx]);

        sc.close();
    }
}
