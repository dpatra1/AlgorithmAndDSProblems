package com.diginsite.bbp.linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Pattern;

public class StackExample {

    public static Pattern BANK_ACCOUNT_NUMBER_PATTERN = Pattern.compile("^[a-zA-Z0-9-.]{4,17}$");


    public static void main(String[] args) {

        boolean matches = BANK_ACCOUNT_NUMBER_PATTERN.matcher("3333").matches();
        System.out.println(matches);
//        int N = 50;
//        Stack<Integer> stack = new Stack<Integer>();
//        while (N > 0) {
//            stack.push(N % 2);
//            N = N / 2;
//        }
//
//        System.out.println(stack.toString());
//
//        for (int d : stack){
//            System.out.println(d);
//        }


        testStackAndQueue();
    }


    private static void testStackAndQueue(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        for (Iterator iterator = q.iterator(); iterator.hasNext();) {
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
        }

//        System.out.println(q.toString());
//
//        Stack<Integer> stack = new Stack<>();
//
//        while(!q.isEmpty()){
//            //stack.push(q.element());
//            System.out.println(q.element());
//        }
//
//        System.out.println(stack.toString());
//
//        Iterator<Integer> iterator = stack.iterator();
//        while (iterator.hasNext()) {
//            Integer integer = (Integer) iterator.next();
//            System.out.println(integer);
//        }
//
//        Integer firstElement = stack.firstElement();
//        int capacity = stack.size();
//
//        Integer integer = stack.get(capacity-1);
//        Integer elementAt = stack.elementAt(capacity-1);
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

    }
}
