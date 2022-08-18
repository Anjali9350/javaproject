package anjali.com;

import java.util.Scanner;
import java.lang.Exception;

public class Exception {
	   
	public static void main (String args[]){
	        Scanner sc=new Scanner (System.in);
	        System.out.println("Enter the num :");
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	try 
	{
	    int a = Integer.parseInt(str1) ;
	    int b = Integer.parseInt(str2) ;
	    int c = a/b;
	    System.out.println(" Result :" +c);
	    
	}

	catch (NumberFormatException ex )
	  {
	      System.out.println(" Format Mismatch");
	  }
	  catch(Exception e)
	  {
	      System.out.println(" Invalid devision " +e);
	  }
	  
	  finally{
	      System.out.println(" Exception encountered ");
	  }

	  System.out.println(" Exception Handling ");
	  
	    }
	}