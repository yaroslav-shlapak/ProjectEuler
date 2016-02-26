package com.shlapak.yaroslav;

import java.util.Arrays;

/**
 * Created by yarl on 26.02.16.
 */
public class P710001Prime {
    public static void main(String[] args) {
        int N = 10001;
        int[] primes = new int[N + 1];
        int i = 2;
        int primeCounter = 0;
        primes[primeCounter] = i;

        while (primeCounter <= N) {
            if(isPrime(i)) {
                primes[primeCounter] = i;
                primeCounter++;
            }
            i++;
        }
        System.out.println(Arrays.toString(primes));
        System.out.println(primes[N]);
    }

    private static boolean isPrime(int n) {
        if(n <= 3) {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for(int i = 5; i * i < n; i++) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
