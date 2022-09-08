package labproject;

public class ShapeMain {

	public static void main(String[] args) {
		//here we recall the method of Square and Rectangle in main method
		Square obj1=new Square();
		obj1.area();
		System.out.println("The area of the Square is : "+obj1.area());
		//this is rectangle method
		Rectangle obj2=new Rectangle();
		obj2.area();
		System.out.println("The area of the Rectangle is : "+obj2.area());
	}

}