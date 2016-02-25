package com.shlapak.yaroslav;

/**
 * Created by yarl on 25.02.16.
 */
public class P1Multiples3and5 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
