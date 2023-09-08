package com.leetcode;

public class RansomNote {

	public static void main(String[] args) {
		
		String s="aaab";
		int n=s.length();
		String ss="aaa";
		int len=ss.length();
		int count=0;
		int min=Math.min(n, len);
		
	
		String[] ar=s.split("");//[a,a]
		String[] arr=ss.split("");//[a,a,b]
		for(int i=0;i<n;i++) {
			for(int j=0;j<len;j++)
			{
				String a=ar[i];
				String b=arr[j];
				if(a.equals(b)) {
					arr[j]="0";
					count=count+1;
					break;
				}
			}
		}
	
		if (count==min) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	
		
		
		
		
//		
//		for (int i=0;i<n;i++) {
//			for (j;j<l;j=j) {
//				char c=s.charAt(i);
//				char cc=ss.charAt(j);
//				if (c==cc) {
//					count=count+1;
//					break;
//				}
//			}
//		}
//		if (count==n) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}

	}

}
