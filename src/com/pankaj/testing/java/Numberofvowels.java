package com.pankaj.testing.java;

public class Numberofvowels {
	public static void main(String[] args) {
	String name = "why i am here qwrttttte";
	name = name.toLowerCase();
	String vowels = "aeiou";
	int count=0;
	for(int i=0;i<name.length();i++) {
		for(int j=0;j<vowels.length();j++){
			if(name.charAt(i)==vowels.charAt(j)) {
			System.out.println("position of vowel "+name.charAt(i)+" is "+i);
				count++;
			}
		}
		
	}
	System.out.println("total vowels are "+count);
	}

}
