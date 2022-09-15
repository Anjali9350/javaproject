package labtest;

/*
 * @author : Anjali
 * Program : WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
 *           Print the name of students whose id is greater than 103.
 * 
 */
	import java.util.HashMap;
	import java.util.Set;

	public class StudentMap {

		public static void main(String[] args) 
		{
			
			
				HashMap<Integer,String> map=new HashMap<>();
				map.put(101, "Aditi");
				map.put(102, "Muskan");
				map.put(103, "Anjali");
				map.put(104, "Pooja");
				map.put(105, "Renu");
				
				Set<Integer> keys=map.keySet();
				for(Integer e:keys)
				{
					if( e.intValue()>103)
					{
					System.out.println(map.get(e));
				    }
				}
				
		}

}