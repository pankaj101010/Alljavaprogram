package com.pankaj.testing.java;

public class Secondgreatestelement {



	public static void main(String[] args) {
		String name ="pankaj is my nameww@!0292";
		String[] name1 =name.split("\\W");
		int max =0;
		int min =8;
		char val = 'z';
		byte k =(byte)val;
		System.out.println(k);
		  Object o = max;
         Object n = min;
         Number p = new Integer(max);
		System.out.println(p.equals(n));
		
		for(String s:name1) {
			System.out.printf("%-2s",s);
			
		}
		 for(int i=1;i<name1.length;i++) {
		  if(name1[i].length()>name1[max].length()) 
				 {
					 max=i;
				 }
				 
			 }
		 System.out.printf("%-14s",name1[max]);
		 }
		
	}
		      
		
		
	
		
	

