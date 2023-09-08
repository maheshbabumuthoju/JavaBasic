package com.leetcode;

public class LongestCommonPrefixinanArray {

	public static void main(String[] args) {
		String arr[] = {"abcdef", "abcdef", "abcdefg","ab", "abc"};
		int n=arr.length;
		String s="";
		int count=0;
        int j=1;
        int x=1;
        if(arr.length==1)
        {
        	System.out.println(arr[0]);
        }
        for(int i=0;i<arr.length;i++)
        {
        	for(j=0;j<arr[0].length();j++)
        	{
        		if(arr[0].charAt(j)!=arr[x].charAt(j))
        		{
        			
        		}
        		else
        		{
        			count++;
        		}
        	}
        	if(count==n-1)
              {
                  s=s+arr[0].charAt(j-1);
                  count=0;
                  j=j+1;
                  i=0;
                  x++;
              }
        	
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        for(int i=0;i<=arr.length-1 && j<=arr[0].length();i++)
//        {
//            if(arr[0].charAt(j-1)!=arr[i].charAt(j-1) && j<arr[i].length()+10)
//            {
//            	j=j-1;
//                break;
//            }
//            else{
//                count++;
//            }
//            if(count==n-1)
//            {
//                s=s+arr[0].charAt(j-1);
//                count=0;
//                j=j+1;
//                i=0;
//            }   
//        }
//        System.out.println(s);
	}

}
