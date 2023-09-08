package com.recursion;

public class Recursion1 {

	public static void print(int start,int n)
	{
		if(start>n)return;
		System.out.println(start);
		start=start+1;
		print(start,n);
	}
	public static void main(String[] args) {
//		printing from 1 to n linearly
		print(1,10);
	}

}
