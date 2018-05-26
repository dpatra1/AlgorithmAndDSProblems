package com.threading;

public class FizzBuzzDemo {

    public static void main(String[] args) {
        int n = 100;
        Thread[] threads = { new FizzBuzzThread(i -> i % 3 == 0 && i % 5 == 0, i -> "FizzBuzz", n),
                new FizzBuzzThread(i -> i % 3 == 0 && i % 5 != 0, i -> "Fizz", n),
                new FizzBuzzThread(i -> i % 3 != 0 && i % 5 == 0, i -> "Buzz", n),
                new FizzBuzzThread(i -> i % 3 != 0 && i % 5 != 0, i -> Integer.toString(i), n) };

        for (Thread thread : threads) {
            thread.start();
        }
    }

}
