package com.pankaj.testing.java;

public class Finddigitnadd {

	public static void main(String[] args) {

		/*
		  ////find digit in the string
		int add = 0;
		String s = "1243kjSDNaodvno25";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				add += Character.getNumericValue((s.charAt(i)));
			}
		}
		
          System.out.println(add);	 
		
		*/
		
		
		String name = "10 01k3jw4fr5gwe6rer7gqegrgrewg4";
		name = name.toLowerCase();
		int add = 0;
		int y = 0;
		int v = 0;
		String digit = "0123456789";

		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < digit.length(); j++) {
				if (name.charAt(i) == digit.charAt(j)) {
					// System.out.print(name.charAt(i));
					add += Character.getNumericValue(name.charAt(i));
					
				}

			}

		}
          System.out.println(add);
	}
	
	// System.out.println(y);

}
