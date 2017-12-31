package com.corejava.simple.string;

public class StringExample {

	public static void main(String[] args) {
		String s1="Vir";
		s1.concat("Pratap");
		System.out.println(s1);
		s1=s1.concat("Uttam");
		System.out.println(s1);
		
		//String Comparison
		String s4="Vir";
		String s5="Vir";
		String s6=new String("Vir");
		String s7="Ravi";
		String s8="Tir";
		
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s6));
		System.out.println(s4.equals(s7));
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.compareTo(s7));
		System.out.println(s7.compareTo(s4));
		System.out.println(s4.compareTo(s8));
		
		//String Concatination
		//Note: After a string literal, all the + will be treated as string concatenation operator.
		System.out.println(40+40+"Vir"+40+40);
		
		String s9="Vir Pratap Uttam";
		System.out.println(s9.substring(5,6));
		
		String a="meow";
		String ab=a+"deal";
		String xy=a.concat("deal");
		System.out.println("ab="+ab);
		String abc="meowdeal";
		System.out.println(xy==abc);
		System.out.println(abc.intern());
		System.out.println(xy.intern());
		System.out.println(abc.intern()==xy.intern());
	}

}
