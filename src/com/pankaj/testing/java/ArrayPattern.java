package com.pankaj.testing.java;

import java.util.Scanner;

public class ArrayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5;
		int y=0;
		System.out.println(Math.pow(r,y));
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a,b,n;
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
        
        int calc = a;
        for(int j=0;j<n;j++)
            {
                calc+=(Math.pow(2,j)*b);
                System.out.print(calc+" ");
            }
             System.out.println();
        }
        in.close();
	}

}
