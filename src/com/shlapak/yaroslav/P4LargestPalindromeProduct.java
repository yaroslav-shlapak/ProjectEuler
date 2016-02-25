package com.shlapak.yaroslav;

/**
 * Created by yarl on 25.02.16.
 */
public class P4LargestPalindromeProduct {
    public static void main(String[] args) {
        int mult;
        for(int i = 999; i > 99; i--) {
            for(int j = 999; j > i - 100; j--) {
                mult = i * j;
                if(isPalindrome(mult)) {
                    System.out.println(i + " " + j);
                    System.out.println(mult);
                    return;
                }
            }
        }
    }

    public static boolean isPalindrome(int n) {
        String s = "" + n;
        String reversedString = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }
        return s.compareTo(reversedString) == 0;
    }
}
