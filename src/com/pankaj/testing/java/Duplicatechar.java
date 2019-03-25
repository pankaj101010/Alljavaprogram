package com.pankaj.testing.java;

public class Duplicatechar {

	public static void main(String[] args) {
		int count = 0;
		String temp = "";
		String[] name = { "vijayvv", "ankush", "sandeep", "pankaja" };
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length(); j++) {
				for (int k = j + 1; k < name[i].length(); k++) {
					if (name[i].charAt(j) == name[i].charAt(k)) {
						count++; 
						// System.out.println("In word " + name[i] +" | "+ name[i].charAt(j)+" | "+" has
						// duplicate character" );
					}

				}

			}

		}
		System.out.println(count);
		System.out.println(temp);
	}

}
