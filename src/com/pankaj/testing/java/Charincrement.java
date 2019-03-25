package com.pankaj.testing.java;

public class Charincrement {

	public static void main(String[] args) {
		String str = "testing*0";
		 StringBuilder result = new StringBuilder();
	        char[] strChars = str.toLowerCase().toCharArray();
	        char[] replacements = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
	        for (int i = 0; i < str.length(); i++) {
	            result.append(strChars[i] >= 'a' && strChars[i] <= 'z' ? replacements[strChars[i] - 97] : strChars[i]);
	        }
	        System.out.println(result.toString());

	}

}
