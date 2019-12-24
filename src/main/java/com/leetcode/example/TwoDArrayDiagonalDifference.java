package com.leetcode.example;

public class TwoDArrayDiagonalDifference {

	public static void main(String[] args) {
		int arr[][] = 
	        { 
	            {11, 2, 4,6}, 
	            {4 , 5, 6,8}, 
	            {10, 8, -12,9}, 
	            {10, 8, -12,9} 
	        };
		System.out.println("Difference: "+TwoDArrayDiagonalDifference.arrayDiagonalDifference(arr));
	}
	
	public static int arrayDiagonalDifference(int[][] array){
	    int dTotal1 = 0;
	    int dTotal2 = 0;

	    for (int row = 0; row < array.length; row++) {
	    	dTotal1 += array[row][row];
	    	dTotal2 += array[row][array.length - row-1];
	    }
		System.out.println("dTotal1: "+dTotal1);
		System.out.println("dTotal2: "+dTotal2);
		
	    return Math.abs(dTotal1 - dTotal2);
	}
}
