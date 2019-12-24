package com.leetcode.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Palindrome {
    public String longestPalindrome(String input) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        Optional<String> largest = palindromes.stream().max(Comparator.comparing(String::length));
        return largest.get();
    }

    private boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }

    public static void main(String arg[]) {
    	System.out.println(new Palindrome().longestPalindrome("babad"));
    }
}
