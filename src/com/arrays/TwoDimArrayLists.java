package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimArrayLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // initializing inner array
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }


        // output
        for (ArrayList<Integer> i:
             list) {
            System.out.println(i);
        }
    }
}
