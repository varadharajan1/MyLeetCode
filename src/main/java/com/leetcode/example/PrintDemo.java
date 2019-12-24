package com.leetcode.example;

public interface PrintDemo { 
    default void hello() { 
        System.out.println("Called from Interface PrintDemo"); 
    } 
} 
