package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(14);
        set.add(17);
        set.add(77);
        set.add(90);

        System.out.println(set);

        System.out.println("set.contains(77) = "+set.contains(77));
        System.out.println("set.isEmpty() = "+set.isEmpty());
        System.out.println("set.size() = "+set.size());

        // Linked Hash Set maintains order also
        Set<Integer> lSet = new LinkedHashSet<>();


        lSet.add(32);
        lSet.add(14);
        lSet.add(17);
        lSet.add(77);
        lSet.add(90);

        System.out.println(lSet);

        System.out.println("lSet.contains(77) = "+lSet.contains(77));
        System.out.println("lSet.isEmpty() = "+ lSet.isEmpty());
        System.out.println("lSet.size() = "+lSet.size());


        // Tree Set maintains order and its sorted
        Set<Integer> tSet = new TreeSet<>();


        tSet.add(32);
        tSet.add(14);
        tSet.add(17);
        tSet.add(77);
        tSet.add(90);

        System.out.println(tSet);

        System.out.println("tSet.contains(77) = "+tSet.contains(77));
        System.out.println("tSet.isEmpty() = "+ tSet.isEmpty());
        System.out.println("tSet.size() = "+tSet.size());


    }
}
