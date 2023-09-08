package com.methods;

public class IndexOfMethod {
// THIS METHOD GIVES ONLY FIRST OCCURANCE ONLY
	public static void main(String[] args) {
		String s=new String("123456789");
//		METHOD 1
//		INDEX IS MUST STARTING FROM 0
		System.out.println(s.indexOf('2'));//1
		System.out.println(s.indexOf('z'));// -1 if the element is not present in the given string then it returns -1
//		METHOD 2
		System.out.println(s.indexOf("8",7));// 8 founds at 7th index
		System.out.println(s.indexOf('8',8));// -1
		String ss="123abc";
		System.out.println(ss.indexOf('b',3));//4
		System.out.println(ss.indexOf('b',4));//5
//		METHOD 3
		String ns="welcome to my world my";
		System.out.println(ns.indexOf("my"));// 'm' in a substring "my" is found at 11 index in a String ns
		System.out.println();
//		METHOD 4
		System.out.println(ns.indexOf("my",11));// it searching from index>=11 'm' in a substring "my" is found at 11 index in a String ns
		
		
//		Now let us come up with the applications of indexOf() method in java of which most frequently are listed below as follows: 
//
//			To know whether a character is vowel or consonant.
//			To count the occurrences of any character in a string.
//			To know whether a character is present in String or not.
//			To find whether a substring is present in String or not.
//			To find whether an input is Digit or Letter or Special Character.
		
//		To count the occurrences of any character in a string.
		String s1="geeksforgeeks";
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.indexOf('e',i)==i)
			{
				count++;
			}
		}
		System.out.println("count of e: "+count);
		
		
//		To know whether a character is present in String or not.
		String s2="geeks for geeks";
		System.out.print(s2.indexOf('g')<0?"character not found":"character is found at ");
		System.out.println("index "+s2.indexOf('g'));
		
		check('1');
	      check('a');
	      check('@');
	
		
	}
//	To find whether an input is Digit or Letter or Special Character.
	public static void check(char c)
    {
        if("0123456789".indexOf(c)>=0)
        {
          System.out.print("It is a digit\n");
        }
      else if("[abcdefghijklmnopqrstuvwxyz]".indexOf(Character.toLowerCase(c))>=0)
      {
        System.out.print("It is a Alphabet\n");
      }
      else{
        System.out.print("It is a Special Character\n");
      }
    }

}

