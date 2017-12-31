package datastructure.stack;

import java.util.Stack;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ababXbaba";
		isPalindrome(str);
		String str2="ababXbabc";
		isPalindrome(str2);
		isPalindromeStack(str);
		isPalindromeStack(str2);

	}
	public static void isPalindromeStack(String s)
	{
		char inputChar[]=s.toCharArray();
		Stack stack=new Stack();
		int i=0;
		while(inputChar[i]!='X')
		{
			stack.push(inputChar[i]);
			i++;
		}
		i++;
		while(i<inputChar.length)
		{
			if(inputChar[i]!=(char)stack.pop())
			{
				System.out.println("Not Palindrome");
				return;
			}
			i++;
		}
		System.out.println("Palindrome");
	}
	
	public static void isPalindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j && s.charAt(i)==s.charAt(j))
		{
			i++;
			j--;
		}
		if(i<j)
		{
			System.out.println("Not Palindrome");
		}
		else
		{
			System.out.println("Palindromes");
		}
	}

}
