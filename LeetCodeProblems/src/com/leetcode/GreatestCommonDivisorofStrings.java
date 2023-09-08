package com.leetcode;

public class GreatestCommonDivisorofStrings {
	public static String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        System.out.println(str1.compareTo(str2));
        
        
        String s="";
        for(int i=0;i<2;i++)
        {
            s=s+str2;
            if(s.equals(str1))
            {
            	break;
            } 
        }
        
        if(s.length()==m) {
        	return str2;
        }
        
        return "x";
        

        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss=gcdOfStrings("ABABAB", "ABAB");
		System.out.println(ss);

	}

}
