package com.strings;

public class ConvertStringToInteger
{

	public static void main(String[] args)
	{

		String s1="100";
		String s2="mahesh";
		int x1=10;
		int x2=20;
		System.out.println(s1+x1);//10010
		System.out.println(s2+x2);//mahesh20o
		System.out.println(Integer.parseInt(s1)+x1);//string of 100 converted into 
		System.out.println(Integer.parseInt(s2));//Exception in thread "main" java.lang.NumberFormatException: For input string: "mahesh"
		

	}

}
