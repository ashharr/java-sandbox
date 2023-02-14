package com.arrays;

public class Main {
    public static void main(String[] args) {
        int[] rollNos = new int[5];
        int[] rollNos2 = {23, 12, 45, 65};
        System.out.println(rollNos2[2]);

        int[] ros; // declaration of array, like its being defined in the stack -> Compile Time
        ros = new int[5]; // actual creation of object in the heap memory -> Run Time

        System.out.println("Looping Arrays:");
        for (int i = 0; i < rollNos2.length; i++) {
            System.out.print(rollNos2[i] + " ");
        }
        System.out.println("\nFor Each Arrays:");
        for (int i : rollNos2) {
            System.out.print(i + " ");
        }
        System.out.println("\nStrings");
        String[] arr = new String[5];
        System.out.println(arr[0]);

    }
}
