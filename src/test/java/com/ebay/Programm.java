package com.ebay;

public class Programm {
    public static void main(String[] args) {
		String s="palani";
		String s1="";
		for (int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			 s1=s1+c;
			 
		}
		System.out.println(s1);
				
	}
}
