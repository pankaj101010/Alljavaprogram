package com.pankaj.testing.java;

import java.util.Scanner;

public final class Letterfind {

	public static void main(String[] args) {
		int count=0;
	Scanner nm = new Scanner(System.in);
	System.out.println("Enter the word of your choice");
	String name =nm.next().toLowerCase();
	System.out.println("which character you want to check (only one character)");
	String ch = nm.next().toLowerCase();
	char ch1 =ch.charAt(0);
	//System.out.println(ch1);
	       for(int i=0;i<name.length();i++) {
	    	   if(ch1==name.charAt(i)) {
	    		   //System.out.print(name.charAt(i)+" ");
	    		   count++;
	    	   }
	    	   
	       }
	       System.out.println("your entered character "+ch1+" is "+count+" times");
	
	

	}

}
