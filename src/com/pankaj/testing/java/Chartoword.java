package com.pankaj.testing.java;

public class Chartoword {
	public static String reverse (String a) {
		String b ="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
			
		return b;
		
	}
	public static void main(String[] args) {
		String name= "siht si aitnenoser ygolonhcet";
		String[] reverseword = name.split("\\s");
		 String value = "";
		 for(int i=0;i<reverseword.length;i++) {
			  value = value +" "+reverse(reverseword[i]);
		 }
      System.out.println(value);
	}
    
}
