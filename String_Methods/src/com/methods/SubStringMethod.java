package com.methods;

public class SubStringMethod {

	public static void main(String[] args) {
		String s="123456789";
		System.out.println(s.indexOf(s.charAt(0)));
		
//		System.out.println(s.length());
		System.out.println(1);//1
		System.out.println(2);//2
		System.out.println(3);//3
		System.out.println(4);//4
		System.out.println(5);//5
		System.out.println(6);//6
		System.out.println(7);//7
		System.out.println(8);//8
		System.out.println(9);//9
//		System.out.println(s.substring(0,s.length()));//123456789
		System.out.println();
		System.out.println();
		for(int i=0;i<=s.length();i++)
		{
			System.out.println(s.substring(i));
		}
		
		String s1="mahesh babu";
		System.out.println(s1.substring(1,2));
		System.out.println(s1.substring(1).length());

	}

}
