
/*
 * @author : Anjali
 * Program : Write a Java program to create multiple thread in Java.
             (Print even and Odd numbers)Set their name and prorities. 
 * 
 */
	class MyThread1 extends Thread
	{
		public void run()
		{
			int number=10;
			//Method to print even number
		      for(int i= 1; i<= number; i++)
		      {
		         if(i % 2 == 0)
		         {
		            System.out.print(Thread.currentThread().getName()+" "+ i + "\n");
		         }
		      }
		      //Method to print odd number
		      for(int i = 1; i <= number; i++)
		      {
		         if(i % 2 == 1)
		         {
		            System.out.print(Thread.currentThread().getName()+" "+ i + "\n");
		         }
		      }
		 }
	}
	public class MyThread 
	{
		public static void main(String args[]) 
		{
		//we create two objects and recall the method here
		 MyThread1 th1=new MyThread1();
		  MyThread1 th2=new MyThread1();
		  //here we set name
		  th1.setName("Thread 1");
		  th1.setName("Thread 2");
		  ///here we set prorities
		  th1.setPriority(5);
		  th2.setPriority(10);
		  //start executing thread
		  th1.start();
		  th2.start();

	    }
	}