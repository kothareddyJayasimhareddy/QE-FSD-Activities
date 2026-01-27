package com;

public class Activity2 {
    public static void main(String[] args){
        int nums[] = {10,77,10,54,-11,10};
        int sum = 0;
        for(int num : nums){
            if(num==10) sum +=num;
        }
        if(sum==30)
            System.out.println("true");
        else
          System.out.println("false");
    }
}
