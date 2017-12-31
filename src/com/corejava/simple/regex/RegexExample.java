package com.corejava.simple.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b1=m.matches();
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		
		boolean b3= Pattern.matches(".s", "as");
		
		System.out.println(b1+" "+b2+" "+b3);
		
		System.out.println(Pattern.compile("..s").matcher("ms").matches());
		System.out.println(Pattern.compile("..s").matcher("ams").matches());
		System.out.println(Pattern.compile("[^abc]").matcher("xyz").matches());
	}

}
