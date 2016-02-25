package com.shlapak.yaroslav;

/**
 * Created by yarl on 25.02.16.
 */
public class P2EvenFibonacciNumbers {
    public static void main(String[] args) {
        int N = (int) 4e6;
        int current = 2;
        int prev = 1;
        int sum = 0;
        int temp;
        while(current < N) {
            if(current % 2 == 0) {
                sum += current;
            }
            temp = current;
            current += prev;
            prev = temp;
        }
        System.out.println(sum);
    }
}
