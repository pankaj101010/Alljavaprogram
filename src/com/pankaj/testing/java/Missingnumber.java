package com.pankaj.testing.java;

import java.util.Arrays;

public class Missingnumber {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 2, 5, 8, 8, 9, 11 };
		Arrays.sort(arr);
		int missing = 0;
		String msval = " ";
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i + 1] - arr[i]) == 0) {

			} else {
				missing += arr[i + 1] - arr[i] - 1;
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i + 1] - arr[i]) == 0) {
				
			} else {
				int ms = arr[i + 1] - arr[i] - 1;
				if (ms != 0) {
					int ls = arr[i] + 1;
					if (arr[arr.length - 1] < ls) {

					} else {
						msval += arr[i] + 1 + ",";
					}
				}
			}
		}
		System.out.println("total missing:" + missing);
		System.out.println("missing numbers are:" + msval);
		System.out.println();
	}

}
