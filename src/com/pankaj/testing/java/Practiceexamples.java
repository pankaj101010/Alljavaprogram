package com.pankaj.testing.java;

public class Practiceexamples {
	/*
	 * public static int degreefind(int a) { int value = 0; while(a>=1) { value +=
	 * a%10; a = a/10; } if(value>9) { return degreefind(value); } return value; }
	 * 
	 * 
	 * 
	 * public static void main(String[] args) { System.out.println(degreefind(476));
	 * }
	 */

	// Code using recurrsion

	/*
	 * public static int Fact(int num) { if(num==1) return 1; //Exit Condition for
	 * odd series else if(num==0) return 0; //Exit Condition for even series else {
	 * return num*Fact(num-2); //Recurrsion method calling its ownself } }
	 * 
	 * public static void main(String[] args) { int number=4;
	 * System.out.println(Fact(number)); } }
	 */

	public static int getLargest(int[] a) {
		int total = a.length;
		int maxproduct = a[0]*a[1];
		for (int i = 0; i < total - 1; i++) {
			if (a[i] * a[i + 1] < 0) {
				if (a[i] * a[i + 1] > maxproduct) {
					maxproduct = a[i] * a[i + 1];
				}
			} else {
				if (a[i] * a[i + 1] > maxproduct) {
					maxproduct = a[i] * a[i + 1];
				}
			}

		}

		return maxproduct;
	}

	public static void main(String[] args) {
		//int[] b = { 9, 10, 5, 2, 24, -1, -48};
		int[] b= {-23, 4, -3, 8, -12};
		System.out.println(getLargest(b));
	}
}
