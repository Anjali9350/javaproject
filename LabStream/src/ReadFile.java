
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.FileReader;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class ReadFile 
	{
		public static void main(String[] args)
		{
			readFile();
		}

		public static void readFile()
		{
			File f=new File("Demo.txt");

				System.out.println("File read in Program..");

				FileInputStream fin;
				try {
					fin = new FileInputStream(f);
					int i=fin.read();
					while(i!=-1)
					{
						System.out.print((char)i);
						i=fin.read();
					}
					fin.close();
				}
				catch (IOException e) {

					e.printStackTrace();
				}
		}		
		}
