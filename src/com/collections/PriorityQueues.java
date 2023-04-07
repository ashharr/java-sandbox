package com.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {

        // Implementing Min Heap
        Queue<Integer> pq = new PriorityQueue<>();
        System.out.println("Queue –");
        pq.offer(40);
        pq.offer(12);
        pq.offer(36);
        pq.offer(24);

        System.out.println(pq.toString());
        pq.poll();

        System.out.println(pq);

        // Implementing Max Heap
        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println("Queue –");
        pq2.offer(40);
        pq2.offer(12);
        pq2.offer(36);
        pq2.offer(24);

        System.out.println(pq2.toString());
        pq2.poll();
        System.out.println(pq2);



    }
}
