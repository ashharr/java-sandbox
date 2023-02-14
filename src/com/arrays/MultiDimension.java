package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
         *   1 2 3
         *   4 5 6
         *   7 8 9
         */

        int[][] arr = new int[3][2];  // only row size is mandatory
        // or do it on the go
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {6, 7, 8, 9}};

        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2[0].length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        Scanner input = new Scanner(System.in);

        // input 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        // output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print((arr[row][col] + " "));
            }
            System.out.println();
        }
        // for each 2D
        for (int[] i : arr) {
            System.out.print(Arrays.toString(i));
        }

    }
}
