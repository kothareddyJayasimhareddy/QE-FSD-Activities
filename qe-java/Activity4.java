package com;

public class Activity4 {
    public static void main(String[] args){
        int arr[] = {4,3,2,10,12,1,5,6};
        int arr2[] = insertionSort(arr);
        for(int num : arr2)
             System.out.print(num+" ");
    }


    public static int[] insertionSort(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int target = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
        return arr;
    }
}
