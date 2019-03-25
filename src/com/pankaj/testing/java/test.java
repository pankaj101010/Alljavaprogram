package com.pankaj.testing.java;
import java.util.ArrayList;
public class test {
	public  String reverse(String s) {
		String rev ="";
		for( int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i );
		}
		System.out.println(rev);
		return rev;
	}
	public void palimdron(String x) {
		String m = "Pankaj is my name";
		if(x.equalsIgnoreCase(m)){
	    System.out.println("true");
			
		}
		else {
			System.out.println("false");

		}
	}
	
	
	public static void main(String[] args) {
		String s =  "pankaj is my name";
		//Student s1 = new Student(100,"java",'A');
		//Student s2 = new Student (200,'B',"hello");
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    
		    System.out.println(cars.size());
		test se = new test();
		//se.reverse(s);
		se.palimdron(s);
		//reverse(s);
	}

}
