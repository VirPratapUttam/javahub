package com.corejava.simple.string;

import java.util.StringTokenizer;
//StringTokenizer class is deprecated now. It is recommended to use split() method of String class or regex (Regular Expression).
public class StringTokenizerExample {

	public static void main(String[] args) {
		String s1="Preparing for Amazon";
		StringTokenizer stk=new StringTokenizer(s1," ");
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
	}

}
