package com.shlapak.yaroslav;

/**
 * Created by yarl on 26.02.16.
 */
public class P6SumSquareDifference {
    public static void main(String[] args) {
        long sumOfSquares = 0;
        long squareOfSum = 0;
        for(int i = 1; i <= 100; i ++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }

        squareOfSum *= squareOfSum;

        System.out.println(squareOfSum);
        System.out.println(sumOfSquares);
        System.out.println(squareOfSum - sumOfSquares);
    }
}
