package com.methods;

public class IndexMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdesfgaeiou";
		String arr[]=s.split("s");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
//		int x=s.indexOf('a');
//		System.out.println(x);
//		for(int i=0;i<s.length()-1;i++)
//		{
//			
//			System.out.println(s.indexOf(s.charAt(i)));
//		}

	}

}
