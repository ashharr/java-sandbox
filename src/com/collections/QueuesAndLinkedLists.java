package com.collections;

import java.util.*;

public class QueuesAndLinkedLists {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Queue –");
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println("\n\nLinked Lists –");
        List<String> students = new LinkedList<>();

        students.add("Ashhar");
        students.add("Anas");
        students.add("Faraz");
        System.out.println(students);

        // Add at particular index
        students.add(1, "Ashhar2");
        System.out.println("Added \"Ashhar2\" at index 1 = " + students);

        ArrayList<String> studentsNew = new ArrayList<>(students);
        System.out.println("All elements added to studentsNew = " + studentsNew);

        // Get element at a particular index
        System.out.println("Get elements at index 0 = " + students.get(0));

        // removing at index
        students.remove(1);
        System.out.println("Element at index 1 removed = " + students);

        // Removing by value
        students.add("Faisal");
        students.add("Anas");
        System.out.println("Before removing = " + students);
        students.remove("Anas");
        System.out.println("After removing by value = " + students);

        // Clear list
        students.clear();
        System.out.println("List cleared = " + students);

        // Contains
        System.out.println("Contains Ashhar = " + students.contains("Ashhar"));

        // Looping through the list
        System.out.println("For Loop –");
        for (int i = 0; i < studentsNew.size(); i++) {
            System.out.println(i + 1 + "] " + studentsNew.get(i));
        }
        System.out.println("For Each Loop –");

        for (String i :
                studentsNew) {
            System.out.println(i);
        }

        // Looping using Iterator
        System.out.println("Iterator –");
        Iterator<String> it = studentsNew.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }




    }


}
