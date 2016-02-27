package com.shlapak.yaroslav;

/**
 * Created by yaroslav on 2/27/16.
 */
public class P9SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int N = 1000;
        for(int c = 100; c < 500; c++) {
            for(int b = 50; b < (N - c); b++) {
                int a = N - c - b;
                if (a * a + b * b == c * c) {
                    System.out.println(a + " " + b + " " + c);
                    System.out.println(a * b * c);
                }
            }
        }
    }
}
