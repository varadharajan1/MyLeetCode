package com.leetcode.example;

public class Example {

	public static void main(String[] args) {
		String str = "123";
		int i = 0;
		System.out.println((str.charAt(i) >= '0'));
		System.out.println((str.charAt(i) <= '9'));
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			System.out.println((str.charAt(i) - '0'));
			i++;
		}

	}

}
