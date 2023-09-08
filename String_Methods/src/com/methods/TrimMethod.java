package com.methods;

public class TrimMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * It does not eliminated the middle spaces of the string.
		By calling the trim() method, a new String object is returned.
		It doesn’t replace the value of String object. 
		Therefore if we want the access to the new String object, 
		we just need to reassign it to the old String or assign it to a new variable.
		 */
		
		String s="    mahesh babu    ";
		System.out.println("s");
		s=s.trim();
		System.out.println(s);

	}

}
