/*
 * Author  : Anjali
 * Program : Write a program to find factorial of a number.
 * Example : we put 3 as a input it shows (3*2*1)=6
 * 
 */
package Anjali.com;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		int n,fact=1;
		System.out.print(" Enter any Number ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.print("Factorial "+ fact);
		}

}
