package com.pankaj.testing.java;

import java.util.regex.*;

public class Specialchar {

	public static void main(String[] args) {
		/*
		String s ="123@#$%&^*+><[]lakdsfjcdsv{";
		for(int i=0;i<s.length();i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
			
			}else {
				System.out.print(s.charAt(i)+" ");
			}
		}
		
		*/
		/*
		
		String name="@asbjfshb#hfsth$rgae%aER^&AERGAE**AERG(RG)_EARGRE+ERG!))";
		String nchar="";
		String sc = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
		 for(int i=0;i<name.length();i++) {
			 for(int j=0;j<sc.length();j++) {
				 if(name.charAt(i)==sc.charAt(j)) {
					 nchar = nchar+name.charAt(i);
					
				 }
				 
			 }
		 }
		 System.out.println(nchar);
		 
		 */
		
		/*
		String name = "@asbjfshb#hfsth$rgae%aER^&AERGAE**AERG(RG)_EARGRE+ERG!";
		String [] nex =name.split("\\W");
		Pattern p = Pattern.compile("\\W");
		Matcher m = p.matcher(name);
		while(m.find()) {
			 System.out.print(m.group());
			 System.out.print(m.start()+" ");
		}
		
		*/
		
		String name = "asbsakjdq213!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~lihdvh928398";
		String[] nex = name.split("\\w");
		//System.out.println(nex.length);
		for(String a:nex) {
			System.out.print(a);
		}
	}

}
