package com.leetcode;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s="abcde";
		String ss="aace";
		int res=longestCommonSubsequence( s, ss);
		System.out.println(res);



	}
public static int longestCommonSubsequence(String text1, String text2) {
        
        String[] ar=text1.split("");
        String[] arr=text2.split("");
        int n=ar.length;
        int n1=arr.length;
        int count=0;
        for ( int i=0;i<n;i++)
        {
            for ( int j=0;j<n1;j++)
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
        if(count==n)
        {
            return count;
        }
        return 0;
    }

}
