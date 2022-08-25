
public class Test2 {
		
//		accept  String array 
		static String strConcat(String st[])
		{
			StringBuilder builder = new StringBuilder();;
			try {
				if(st==null) {
					throw new Exception();
				}


				for(String s : st) {

					builder.append(s+" ");
				}
			}catch(Exception e)
			{

				System.out.print("Java Lab Test");
			}
 
			return builder.toString();
		}
		public static void main(String[] args) {
//			 three array of Strings
			String st1[]= null;
			String st2[]= {"Java","Lab","Assignment"};
			String st3[]= {"Anjali","Sharma"};

			System.out.println(strConcat(st1));
			System.out.println(strConcat(st2));
			System.out.println(strConcat(st3));

		}
	}