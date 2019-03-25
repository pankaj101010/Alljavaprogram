package com.pankaj.testing.java;

public class Finddigit   {

	public static void main(String[] args) throws Exception
	{
		String name= "hi123HEre890is re3sone8ntia ";
	    StringBuilder n = new StringBuilder(name);
		String digit ="0123456789";
         for(int i=0;i<n.length();i++){
        	 for(int j=0;j<digit.length();j++) {
        		 if(name.charAt(i)==digit.charAt(j)) {
        			 
        			 name = name.replace(name.charAt(i), 'X');
        		       n.setCharAt(i,'X');
        		 // continue;
        			//break;
        			//System.out.println(n);
        			
        		 }
        		 
        	 }
        	 
         }
         System.out.println(n);
	}

}
