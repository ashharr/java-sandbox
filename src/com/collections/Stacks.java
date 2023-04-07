package com.collections;

import java.sql.SQLOutput;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(35);
        stack.push(12);
        stack.push(66);
        stack.push(12);

        System.out.println("Stack popped = " + stack.pop());
        System.out.println("Stack popped = " + stack.pop());
        System.out.println("Stack popped = " + stack.pop());
        System.out.println("Stack popped = " + stack.pop());
        System.out.println("Stack popped = " + stack.pop());
//        System.out.println(stack.pop());  Empty Stack Exception

        stack.push(34);
        stack.push(35);
        stack.push(12);
        stack.push(66);
        stack.push(12);
        System.out.println(stack.peek());

        System.out.println(stack.toString());


    }
}
