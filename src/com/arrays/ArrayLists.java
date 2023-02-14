package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        // You can only pass Wrapper as a generic to ArrayList
        // Primitives CANNOT be passed here
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(150);
        list.add(56);
        list.add(123);
        list.add(875);
        list.add(455);
        list.add(123);

        System.out.println(list);
        System.out.println(list.getClass().getSimpleName());

        // contains?
        System.out.println("contains(123) ? " + list.contains(123));

        // remove
        System.out.println("remove(4) ");
        list.remove(4);
        System.out.println(list);

        // set
        System.out.println("set(0, 100) ");
        list.set(0, 100);
        System.out.println(list);

        // input
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(8);
        for (int i = 0; i < 6; i++) {
            arr.add(input.nextInt());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(arr.get(i));
        }

/*
        // Array List is Dynamic in nature
        // You can keep adding new elements
        // irrespective of its initial capacity
        // It keeps increasing its size when
        // size gets full to some amount
        // it creates a copy of it to a new
        // ArrayList which has larger size
        // it does all of this in amortized O(1)
*/

    }
}
