package com.pankaj.testing.java;

public class Palim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "aabaa";
		String up ="";
		for(int i=name.length()-1;i>=0;i--) {
			up += name.charAt(i);
		}
//	    if(name==up) {
//	    	return true;
//	    }
//	    else {
//	    	return false;
//	    }
		System.out.println(up);
	}

}
