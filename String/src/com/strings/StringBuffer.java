package com.strings;



import java.util.Scanner;

//StringBuffer is a class in Java that represents a mutable sequence of characters.
//It provides an alternative to the immutable String class, 
//allowing you to modify the contents of a string without creating a new object every time.
public class StringBuffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number:");
		int num3 = sc.nextInt();

		int smallest = num1;
		int secondSmallest = num1;

		if (num2 < smallest) {
			secondSmallest = smallest;
			smallest = num2;
		} else if (num2 < secondSmallest) {
			secondSmallest = num2;
		}

		if (num3 < smallest) {
			secondSmallest = smallest;
			smallest = num3;
		} else if (num3 < secondSmallest) {
			secondSmallest = num3;
		}

		System.out.println("The second smallest number is: " + secondSmallest);
		
		

	}

}
