package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        // Array of primitives
//        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++) {
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));
//
        // Array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "ASHHAR";
        System.out.println(Arrays.toString(str));

    }
}
