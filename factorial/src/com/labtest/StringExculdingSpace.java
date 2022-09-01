package com.labtest;
/**
 * @author : Anjali
 * Program : Write a program to count number of char in a string entered by user
 *           excluding space.
 */
import java.util.*;

public class StringExculdingSpace {

	static void display() {   //method for calling
		int count = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String : "); // for print on screen
		String sc = s.nextLine();
		for (int i=0; i<sc.length();i++) //here we use for loop
		{
			if (sc.charAt(i)!=' ')
			{
			   count++;
			}
		}
			System.out.println("Count of char. in String "+count);
		}	
			
	public static void main(String[] args) {  // program for string entered by user
		StringExculdingSpace obj= new StringExculdingSpace ();
		obj.display();
	}
}