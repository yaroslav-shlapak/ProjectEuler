package com.shlapak.yaroslav;

/**
 * Created by yarl on 25.02.16.
 */
public class P3LargestPrimeFactor {


    public static void main(String[] args) {
        long n = 600851475143l;
        int i = 2;
        int max = i;
        while( n > 1) {

            if(n % i == 0) {

                n /= i;

                if(i > max) {
                    max = i;
                    System.out.println(max);
                }
            }
            i++;

        }

        System.out.println(max);
    }
}
