package com.leetcode;

public class LongestSubStringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int res=xx();
//		System.out.println(res);
//		String s="aabcd";
//		int n=s.length();
//		int max=1;
//        int length=0;
//        if(n==0)
//    	{
//    		System.out.println(0);
//    	}
//        if(n==1)
//        {
//        	System.out.println(1);
//        }
//        
//        for(int i=0;i<n-1;i++){
//        	
//            for(int j=i+1;j<n;j++){
//            	if(s.charAt(j)==s.charAt(j+1))
//            	{
//            		break;
//            	}                      	
//                if(s.charAt(i)==s.charAt(j))
//                {
//                    length=s.substring(i,j).length();
//                    max=Math.max(max,length);
//                	break;
//                }
//            }
//        }
//        System.out.println(max);
//int x=xx();
//System.out.println(x);
//	}
//	public static int xx() {
////		String s="pwwkew";
//		String s="aabcd";
//		int n=s.length();
//        int max=0;
//        int length=1;
//        if(n==0)
//            {
//                return max;
//            }
//        if(n==1)
//        	{
//        		return max=Math.max(length,max);
//        	}
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<n;j++){
//                if(s.charAt(i)!=s.charAt(j) )
//                {
//                    length=s.substring(i,j+1).length();
//                    max=Math.max(max,length);
//                    
//                }
//            }
//        }
//        return max;
		
//String s="abaca";
//int n=s.length();
//int x=s.length();
//int newcount=0;
//for(int i=0;i<n-1;i++)
//{
//	int count=1;
//	for(int j=i+1;j<x;j++)
//	{
//		if(s.charAt(i)!=s.charAt(j))
//		{
//			count++;
//			newcount=Math.max(count, newcount);
//		}
//		else
//		{
//			x=i;
//			break;
//		}
//	}
//}
//System.out.println(newcount);

String s="abaca";
int x=s.length();
int ls=0;
char c[]=s.toCharArray();
for(int i=0;i<c.length-1;i++)
{
	String s1="";
	for(int j=i+1;j<x;j++)
	{
		if(s.charAt(i)!=s.charAt(j))
		{
			s1=s1+s.charAt(j);
		}
		else
		{
			ls=Math.max(ls, s1.length()+1);
			x=j;
		}
	}
}
System.out.println(ls);
}
}
	
	


