package com.shlapak.yaroslav;

/**
 * Created by yaroslav on 2/27/16.
 */
public class P10SumOfPrimes {
    public static void main(String[] args) {
        int N = (int) 2e6;
        long sum = 0;

        for(int i = 2; i < N; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        if(n <= 3) {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for(int i = 2; i * i < n; i++) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
