package com.pankaj.testing.java;

import java.util.StringTokenizer;

public class Wordfromstring {
	public static boolean vowel(String s) {
		String vowels = "aeiou";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (s.charAt(i) == vowels.charAt(j)) {

					return true;
				}
			}

		}
		return false;
	}

	public static void main(String[] args) {
		String name = "why iiiii am here awesome great fffbbbffbb";
		name = name.toLowerCase();
		String val = "";
		StringTokenizer t = new StringTokenizer(name);
		while (t.hasMoreTokens()) {
			val = t.nextToken();
			for (int i = 0; i < val.length(); i++) {
				if (vowel(val)) {
					System.out.print(val+" ");
					break;
				}
			}
		}

	}

}
