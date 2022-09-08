package labproject;

public class StudentMain {
	
	public static void main(String args[])
	{
		//here we recall our methods in main projects
		Student obj1 =new Student();
		{
		obj1.setRoll_No(45);
		obj1.setName("Anjali");
		obj1.setAge(21);
		System.out.println(obj1.getRoll_No());
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		
		}
		
		
		Student obj2 =new Student();
		{	
		obj2.setRoll_No(46);
		obj2.setName("Rakesh");
		obj2.setAge(22);
		System.out.println(obj2.getRoll_No());
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		}
		
		
		Student obj3 =new Student();
		{
		obj3.setRoll_No(47);
		obj3.setName("Pooja");
		obj3.setAge(23);
		System.out.println(obj3.getRoll_No());
		System.out.println(obj3.getName());
		System.out.println(obj3.getAge());
		}
	}

}
