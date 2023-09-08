package com.leetcode;
//https://leetcode.com/problems/the-kth-factor-of-n/submissions/?envType=study-plan-v2&envId=amazon-spring-23-high-frequency
public class TheKthFactorOfn {
	public static int kthFactor(int n, int k) {
        int count=1;
        int min=Integer.MAX_VALUE;
        
        for(int i=2;i<=12;i++)
        {
            if(n%i==0)
            {
                count++;
            }
            if(count==k)
            {
                return i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		
		int res=kthFactor(124,2);
		System.out.println(res);//-1

	}

}
