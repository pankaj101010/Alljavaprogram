package com.pankaj.testing.java;

public class Stringbufferdemo {

	public static void main(String[] args) {
		String s =" hello hello hello hello hello hello hello";
	     s.concat(" java");
		System.out.println(s.length());
		StringBuffer sb= new StringBuffer(s);
		sb.append(s);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		// sb.append(" java");
		 //System.out.println(sb);
	}

}
/*
 public class Stringbufferdemo {

	public static void main(String[] args) {
		   StringBuffer sb = new StringBuffer(17);  
		   
	        System.out.print("enter your string value: ");  
	        Scanner sc = new Scanner(System.in);  
	        sb.append(sc.nextLine()); 
	                  System.out.print("enter index value: ");  
	                  int index = sc.nextInt();   
	                 System.out.print("enter character value: ");  
	                 char ch = sc.next().charAt(0);  
	        // set character at input index  
	        sb.setCharAt(index, ch);  
	                  
	                 
	        System.out.println("new string = " + sb);  
	        sc.close();  

	}

}
 
*/