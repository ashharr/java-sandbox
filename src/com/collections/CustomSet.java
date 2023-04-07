package com.collections;

import java.util.HashSet;
import java.util.Set;
public class CustomSet {
    public static void main(String[] args) {
        Set<Employee> eSet = new HashSet<>();

        eSet.add(new Employee("Ashhar", 52, 25000.0));
        eSet.add(new Employee("Faraz", 52, 50000.0));
        eSet.add(new Employee("Faisal", 52, 25000.0));
        eSet.add(new Employee("Anas", 52, 25000.0));
        eSet.add(new Employee("Anas", 52, 25000.0));

        // Note: Employee will be inserted twice even when their values are same
        // That's because Set treats both objects as different thats why it inserts twice

        // After adding equals() and hashCode() function in our POJO class Set understands
        // and now it compares values instead of object type
        System.out.println(eSet);
    }

}
