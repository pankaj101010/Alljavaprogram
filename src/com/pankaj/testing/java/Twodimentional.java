package com.pankaj.testing.java;

public class Twodimentional {

	public static void main(String[] args) {
		String [][] names = {{"vijay","ankush","sandip"},{"kumar","lal","gaikwad"}};
		 
		///System.out.println(names[0][0]);
		  //System.out.println(names[0][0]+names[1][0]);
		   for(int i=0;i<3;i++) {
			   for(int j=0;j<2;j++) {
		  
		  System.out.print(names[j][i]+" "); 
		  } 
			   System.out.println();
			   }

	}
}


