package labproject;

public class CalculatorMain {

	public static void main(String[]args)
	{
		Calculator obj= new Calculator();
		obj.add(3,4);   //here we use int add(int,int)double
		obj.add(1.1,2,3);    //add(double,int,int)String
		obj.add("2","4");    //add String(String,String)
		obj.Sub(1,6);        //int Subtract(int,int)double
		obj.Sub(3,2);        //subtract(double,double)
	}


}
