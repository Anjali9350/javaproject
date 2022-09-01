package com.labtest;
/**
 * @Author : Anjali
 * Program : Write a program to print table of any number input by user.
 */
import java.util.*;
public class PrintTable {
	
	static	void display() {  //method for calling
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number which you want for Table : "); // to print on the screen
		int table = s.nextInt();
			 // here we use for loop 
		for(int i = 1; i<=10;i++ ){
			System.out.println(table*i);
	}
			
	}
public static void main(String[] args) {
	// Program for entered string excluding space
		PrintTable obj= new PrintTable ();
		obj.display();
	}
}