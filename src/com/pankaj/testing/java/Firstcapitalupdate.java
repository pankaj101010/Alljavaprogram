package com.pankaj.testing.java;

import java.util.StringTokenizer;

public class firstcapitalupdate {

	public static void main(String[] args) {
		String name="hello this Is resonentia Technology new generation ".toLowerCase();
		String token=" ";
		String capital="";
		StringTokenizer cap = new StringTokenizer(name);
		    while(cap.hasMoreTokens()){
		    	token=cap.nextToken();
		    	token =token+" ";
		    	for(int i=0;i<token.length();i++) {
		    		if(i==0) {
					 capital =capital+ Character.toString(token.charAt(i)).toUpperCase();
		    		}else {
		    			capital = capital+token.charAt(i);
		    		}
		    		
		    	}
		    }
		    system.out.println("capital");
		
		}

}
