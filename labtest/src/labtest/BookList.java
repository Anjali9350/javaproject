package labtest;

import java.util.ArrayList;
import java.util.Collections;

public class BookList {
	
public static void main(String[]args) {
			
	ArrayList<Book>list1=new ArrayList<>();
			Book B1 = new Book ("100"," Foundation", " P K Sinh");
			Book B2 = new Book ("101","Logical", " RajaRaman");
			Book B3 = new Book ("102"," C++", " Ram");
		
	ArrayList<Book>list2=new ArrayList<>();
			Book B4 = new Book ("103","Communication Skills", "Navita");
			Book B5 = new Book ("104","Web Designing", "Satish Jain");
			Book B6 = new Book ("105","Java", "James");
		
			list1.add(B1);
			list1.add(B2);
			list1.add(B3);
			list1.add(B4);
			list1.add(B5);
			list1.add(B6);
		
			for(Book B:list1)
			   {
				System.out.println(B);
				}
	}
}