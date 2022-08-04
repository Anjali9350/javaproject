/*
 * Author : Anjali
 * Program: This java program shows how to calculate total number of character in a string.
 */

package StringProgram;


public class CountCharacter {

	public static void main(String[] args) {
		String text = "my name is muskan singal!";
		int count = 0;
		
		//Count every character except space
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) !=' ') 
				count++;
		}
		System.out.println("Total number of characters is: "+count);
	}

}
