/*
 * @author : Anjali
 * Program : Write a Java program to append text to an existing file.
 */
import java.io.FileWriter;
import java.io.IOException;

	public class AppendFile {

		public static void main(String[] args) {
			try   //here we use try catch method 
		      {
		         FileWriter fw = new FileWriter("Demo.txt", true); //Method to append the file
		         fw.write("My name is Anjali");
		         fw.close();
		         System.out.println("File append successffully");
		      }
		      catch(IOException ioe)
		      {
		         System.out.print("Invalid");
		      }

		}

	}
