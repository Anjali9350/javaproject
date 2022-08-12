package Anjali.com;

public class BlankSpace {
	
		public static void main(String[] args) {
			String str = "    Java        programs   ";
			 
	        // Call the replaceAll() method
	        str = str.replaceAll("\\s", "");
	 
	        // print the final string
	        System.out.println(str);
	        

		}

	}