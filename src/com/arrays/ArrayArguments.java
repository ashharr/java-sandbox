package com.arrays;

import java.util.Arrays;

public class ArrayArguments {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7};
        System.out.print(Arrays.toString(nums));
        System.out.print("\n" + Arrays.toString(mutateArray(nums)));
    }
    static int[] mutateArray(int[] arr){
        arr[0] = 786;
        arr[1] = 745;
        return arr;
    }
}
