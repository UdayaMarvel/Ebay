package com.ebay;
import java.util.*;
public class MageshTask 
{
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	if(a<=100 && a>=91)
	{
		System.out.println("The Grade is S");
		
	}
	
	else if(a<=90 && a>=81)
	{
		System.out.println("The Grade is A");
		
	}
	else if(a<=80 && a>=71)
	{
		System.out.println("The Grade is B");
		
	}
	else if(a<=70 && a>=61)
	{
		System.out.println("The Grade is C");
		
	}
	else if(a<=60 && a>=51)
	{
		System.out.println("The Grade is D");
		
	}
	else
	{
		System.out.println("Failed in the Subject");
	}
}
}
