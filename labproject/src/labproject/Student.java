package labproject;
/*
 * @author :Anjali
 * Program :Create a class Student with four data members and constructors.
 *           Institute name  it should be static and final,
 *           roll no.
 *           name
 *           age
 *           Generate getter/setter and Override toString():In the main class make 3objects of student ..set their values and print details.
 * 
 */

public class Student {

		static final String institute_name = " Anudeep";
		private int roll_No;
		private String name;
		private int age;
		
		public Student() { //here we use constructors for data members
			super();
			this.roll_No = roll_No;
			this.name = name;
			this.age = age;
		}
	public void setinstitute_name(String string) {
			// TODO Auto-generated method stub
			
		}

       //here we use getter/setter
		public int getRoll_No() {
			return roll_No;
		}


		public void setRoll_No(int roll_No) {
			this.roll_No = roll_No;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public static String getInstituteName() {
			return institute_name;
		}
		//here we generate to string 
		@Override
		public String toString() {
			return "Student [roll_No=" + roll_No + ", name=" + name + ", age=" + age + "]";
		}
		
		
		
		
		
	}
