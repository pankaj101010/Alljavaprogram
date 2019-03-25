package com.pankaj.testing.java;

import java.util.Scanner;

public class Century {

		public static int century(int year) {
		return 1+(year-1)/100;
	       // double yr =(double) year/100;
	     //   System.out.println(yr);
	    //    yr = Math.ceil(yr);
	    //    System.out.println(yr);
	    //    return (int)yr;
//	        System.out.println(x);
//	        if(x <=10) {
//	        System.out.println();
//	        return x;
//			}
//	        else {
//	              	return y;
//	        }
		}
	public static void main(String[] args) {
		   Scanner fd = new Scanner(System.in);
	       System.out.println("enter value");
	       int year = fd.nextInt();
	       System.out.println(century(year)+" century");
		

	}

}
