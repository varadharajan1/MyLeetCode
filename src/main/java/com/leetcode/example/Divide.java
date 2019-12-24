package com.leetcode.example;

public class Divide {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
		int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;
		
        if (dividend > 0) dividend = -dividend;
        if (divisor > 0) divisor = -divisor;
        
        int ans = 0;
        while (dividend <= divisor) {
            int bitCount = 0;
			
            for (int div = divisor; dividend <= div && div < 0; div <<= 1) {
                dividend -= div;
                ++bitCount;
            }
			ans += (1 << bitCount) - 1;
        }
        return ans * sign;
    }
}
