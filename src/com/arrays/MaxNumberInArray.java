package com.arrays;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1 , 23, 100 , 45, 200 ,99};
        System.out.println((max(arr)));
    }
    static int max(int[] num){
        int maxVal = num[0];
        if(num.length == 0){
            return -1;
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i] > maxVal) {
                maxVal = num[i];
            }
        }
        return maxVal;
    }
}
