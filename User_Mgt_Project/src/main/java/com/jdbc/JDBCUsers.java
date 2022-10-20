package com.jdbc;

import java.util.Scanner;

public class JDBCUsers {

public static void main(String[] args) {
	        
	while(true)
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("press 1 to Create an user");
		System.out.println("press 2 to Update user password");
		System.out.println("press 3 to Delete an user");
		System.out.println("press 4 to Retrieve an user");
		System.out.println("press 5 to Display list of all the users");
		System.out.println("press 6 to exit");
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		boolean flag;
		switch(i)
		{
		
		case 1:{
			System.out.println("Enter name to create user: ");
			String uname=sc.next();
			System.out.println("Enter password of the user: ");

			if(true)
			{
			   String password=sc.next();
			if(password.length()>6 && !password.contains(" "))
			{
			   flag=UsersDAO.createUser(uname,password);
			if(flag)
				System.out.println("successfully creater a user");
			}
			else
			{
			   System.out.println("please enter a valid password");
			}
			}
			break;
		    }
		
			case 2:{
				System.out.println("Enter that name by whose reference the password is updated:");
				String uname=sc.next();
				System.out.println("Enter new password to update: ");
				String newPassword=sc.next();
				flag=UsersDAO.updatePassword(uname,newPassword);
				
			if(flag)
				System.out.println("Successfully password is updated");
			else
				System.out.println("problem occured during updated a password");
			break;
				            }
				
			case 3:{
				System.out.println("Enter user name to delete the user");
				String uname=sc.next();
				flag=UsersDAO.deletionUser(uname);
			if(flag)
				System.out.println("User deleted successfully");
			else
				System.out.println("problem occured while deleting the user");
			break;
				            }
			
			case 4:{
				System.out.println("Enter name to Retrive a user");
				String uname=sc.next();
				flag=UsersDAO.retrievalUser(uname);
			if(flag)
				System.out.println("User retrival and password is successful of particular user");
			else
				System.out.println("problem occured during retrival user name and password of particular user");
            break;
				}
			
				
			case 5:{
				System.out.println("displaying the list of all the users");
				flag=UsersDAO.displayingListOfAllTheUsers();
			if(flag)
				System.out.println("displaying list successfull");
			else
				System.out.println("problem occured during displaying the list");
            break;
				   }

			case 6:{
				System.out.println("Good by have a nice day");
				flag=false;
				   }

			break;
				
		  default: {
					System.out.println("Please enter a valid no.");
					}
				}
			}

		}

}
