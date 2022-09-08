package labproject;
/*
 * @author :Anjali
 * Program :Create a class Calculator with two methods add() and substract() and default
 *          and parameterized constructor 
 *          Overload these methods ----int add(int,int)double
 *          add(double,int,int)String
 *          add(String,String)
 *          int substract(int,int)double
 *          substract(double,double) 
 */


public class Calculator {
    //here we use first method add()
	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(+c);
		
		
		}
	public void add(double a,int b,int c)
	{
		double d;
		
		d= a+b+c;
		System.out.println(+d);
	}
	public void add(String a,String b)
	{
		String c;
		
		c= a+b;
		System.out.println(c);
	}
	//here we use second method subtract()
	public void Sub(int a ,int b)
	{
		int c;
		
		c= a-b;
		System.out.println(-c);
	}
   public void Sub(double a,double b)
   {
	   
	   double c;
	   c=a-b;
}

}