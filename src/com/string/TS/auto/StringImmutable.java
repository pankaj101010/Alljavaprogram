package com.string.TS.auto;

public class StringImmutable {
	String name ;
	public StringImmutable(String s) {
		this.name=s;
	}
	public String toString() {
		return this.name;
	}

	public static void main(String[] args) {
		
		
		StringImmutable s1 = new StringImmutable("pankaj");
	   	StringImmutable s2 = new StringImmutable("pankaj");
     String k = new String("pankaj");
     String m = new String("sumit");
     String n = new String("sumit");
     String x ="pankaj";
     String Y = "p";
     System.out.println(x.equals(k));
    // s1 =s2;
     //System.out.println(s1.name==s2.name);
//     System.out.println(s1.toString());
//       
//     System.out.println(s1.toString().equals(s2.toString()));
//     System.out.println(s2.hashCode()); 
//     System.out.println(s2);
 //   System.out.println(k.equals(m));
//    System.out.println(k.equals(s1));
//    System.out.println(m.equals(n));
   
	}

}
