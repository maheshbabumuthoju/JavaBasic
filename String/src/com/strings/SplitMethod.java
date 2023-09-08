package com.strings;

import java.util.Scanner;

public class SplitMethod {

	public static void main(String[] args) {
		
//		SYNTAX : String.split(String regex,int limit)
//		regex – a delimiting regular expression
//		Limit – the resulting threshold
		
		String s=" mahesh  babu   ";
		String arr[]=s.trim().split(" ");
		System.out.println(arr[arr.length-1].length());
		for(int i=0;i<=arr.length-1;i++)
		{
//			System.out.println(arr[i]);
		}
		
//		String str="Geekss@for@geekss";
//		String a1[]=str.split("s");
//		for ( String a : a1)	
//		{
//			System.out.println(a);
//		}
//		System.out.println();
//		
//		String str1 = "word1,word'2word3@word4?word5.word6";
//        String[] a2 = str1.split("[, ?.@']+");
// 
//        for (String a : a2)
//            System.out.println(a);
//        
//        String str2 = "Hello123! How are you? I'm doing well. #JavaProgramming!";
//        
//        // Split by special characters
//        String[] result = str2.split("[^a-zA-Z0-9]+");
//        
//        // Print the substrings
//        for (String substring : result) {
//            System.out.println(substring);
//        }
//		
//		String s="24032099390";
//		String []arr=s.split("");//SPLIT THE STRING BY USING NULL VALUE HERE WE CAN GET EACH AND EVERY ELEMENT
////		int a=Integer.parseInt(arr[0]);//TO convert string numbers to integer
//		int temp=Integer.MIN_VALUE;
//		
//		//for loop by using string length
//		for(int i=0;i<=s.length()-2;i++)
//		{
//			int a=Integer.parseInt(arr[i]);
//			int b=Integer.parseInt(arr[i+1]);
//			int c=a*10+b;
//			if(c>temp)
//			{
//				temp=c;
//			}
//		}
//		System.out.println(temp);
//		
//		
//		
//		//for loop by using array  length
////		we have to stop the index before last index not a last index
//		for(int i=0;i<=arr.length-2;i++)
//		{
//			int a=Integer.parseInt(arr[i]);
//			int b=Integer.parseInt(arr[i+1]);
//			int c=a*10+b;
//			if(c>temp)
//			{
//				temp=c;
//			}
//		}
//		System.out.println(temp);
//		
//		
//		temp=Integer.MAX_VALUE;
//		for(int i=0;i<=arr.length-2;i++)
//		{
//			int a=Integer.parseInt(arr[i]);
//			int b=Integer.parseInt(arr[i+1]);
//			int c=a*10+b;
//			if(c<temp)
//			{
//				temp=c;
//			}
//		}
//		if(temp<=9)//if min value is like 02,04,03,09... padup the integer value	
//		{
//			System.out.println("0"+temp);
//		}
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the string: ");
//        String S = scan.nextLine();
//        String[] array = S.split("\\W+");
//        System.out.println(array.length);
//        for (String word : array)
//        {
//            System.out.println(word);
//        
//        }
//        
//        scan.close();

	}

}
