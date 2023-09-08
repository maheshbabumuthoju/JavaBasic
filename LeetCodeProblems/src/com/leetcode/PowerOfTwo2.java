package com.leetcode;

public class PowerOfTwo2 {

	public static void main(String[] args) {
		
		boolean b=powerOfTwo(134217729);
		System.out.println(b);
	}
	public static boolean powerOfTwo(int n)
	
	{
//	METHOD 1
		
//		int res=0;
//		for ( int i=0;i<=n/2;i++){
//            res=(int)Math.pow(2,i);
//            if(res==n)
//            {
//                break;
//            }
//
//        }
//		if(res==n) {
//			return true;	
//		}
//		return false;
		
//	METHOD 2
		
		if(n<=0) {
			return false;
		}
		
		return (n&(n-1))==0;
		
		
		
	}

}
