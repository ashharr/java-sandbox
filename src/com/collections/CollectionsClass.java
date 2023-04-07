package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Ashhar", 2,25000.0));
        list.add(new Employee("Faraz", 4,25000.0));
        list.add(new Employee("Anas", 3,25000.0));
        list.add(new Employee("Faisal", 1,25000.0));

        Employee s1 = new Employee("Ashhar", 2,25000.0);
        Employee s2 = new Employee("Faraz", 3,25000.0);

//        System.out.println((s1.compareTo(s2)));

        System.out.println(list);

        Collections.sort(list);
//        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));


        System.out.println("\nAfter Sorting –\n"+list);


//        List<Integer> list = new ArrayList<>();
//        list.add(34);
//        list.add(12);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(76);
//        list.add(29);
//        list.add(75);
//
////        System.out.println("min element " + Collections.min(list));
////        System.out.println("max element " + Collections.max(list));
////        System.out.println(Collections.frequency(list, 9));
//
//        Collections.sort(list, Comparator.reverseOrder());
//
//        System.out.println(list);
    }
}
