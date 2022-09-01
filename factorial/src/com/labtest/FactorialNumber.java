package com.labtest;
/*
 * @author : Anjali
 * Program : Write a method to find factorial of a number input by user.
 *           Factorial (int n) call this method from main() and pass arguments n.Repeat
 *           this untill user enters no.
 */
import java.util.Scanner;

public class FactorialNumber {  
	
	 static void checkFactorial(int n) {
		 int fact=1;
		 //here we use for loop and adding the elements
		   for(int i=1;i<=n;i++) {
			   fact=fact*i;
		   }
		   System.out.println("Factorial of the number" +fact);
	 }

	public static void main(String[] args) {
		//Program for finding factorial numbers
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the Number");  //to print on the screen
			int n=sc.nextInt();
			checkFactorial(n);
			System.out.println("Do you want to continue (yes/no)");
			choice=sc.next().toLowerCase();
		}while(choice.equals("yes"));
  }
}
   

