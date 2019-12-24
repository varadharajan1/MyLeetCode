package com.leetcode.example;

public class InterfaceDemo implements PrintDemo { 
	  
    public static void main(String[] args) 
    { 
    	InterfaceDemo interfaceDemo = new InterfaceDemo();
    	interfaceDemo.hello(); 
  
    } 
  
    // Class Static method is defined 
    public void hello() 
    { 
        System.out.println("Called from Class"); 
    } 
} 