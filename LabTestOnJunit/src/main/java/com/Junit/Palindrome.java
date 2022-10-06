package com.Junit;
/*
 * @author  : Anjali
 * Program : Write a program for to check a palindrome string.
 *            Write test cases for 4 different parameters (use @parametrizedTest Annotation).
 * 
 */
public class Palindrome {
	
	public static boolean isPalindrome(String str)
	{
		String rev=" ";
		//using loop for reverse the string
	for(int i=str.length()-1;i>=0;i--)
		{
		 rev=rev+str.charAt(i);
		}
	//checking whether a string is palindrome or not
		if(str.equals(rev))
			return true;
		else 
			return false;
	}

}
