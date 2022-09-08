package labproject;

public class Rectangle implements Shape {
	//here we insert the length and width , put method with area
	public int length=7;
     @Override  //here is method of area
	public int area() {
		int ar=length*length;
		return ar;
	} 
}
