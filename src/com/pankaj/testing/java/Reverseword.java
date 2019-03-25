package com.pankaj.testing.java;
public class Reverseword{
	public static void main(String[] args) {
//		  char a = 'a';
//		  int c = a+1;
//		  char d = (char)c;
		//  System.out.println(d);
		String name ="i am a proud indian";
		StringBuffer n = new StringBuffer(name);
		System.out.println(n.reverse());
		String[] reverse = name.split("\\s");
		//String newword="";
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.print (reverse[i]+" ");
		//newword=newword+" "+reverse[i];	 
		}
      // System.out.println(" "+newword);
		
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	       
	    
	 // } 
		
		
	        	
	        	  
	          
	         
	
	
	}
}

 