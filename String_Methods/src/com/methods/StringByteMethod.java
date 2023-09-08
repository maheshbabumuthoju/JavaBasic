package com.methods;

import java.nio.charset.Charset;



public class StringByteMethod {

	public static void main(String[] args) {
		byte[] b_arr = {71, 101, 101, 107, 115};
		Charset cs = Charset.defaultCharset();
		String s_byte_char = new String(b_arr, cs); 
		System.out.println(s_byte_char);//Geeks
		
		byte bytes[]= {97,98,99,100};
		String s = new String(bytes);
		System.out.println(s);//abcd

	}

}
