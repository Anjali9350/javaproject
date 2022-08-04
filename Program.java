package StringProgram;

class shape {

public void show (){ 
    System.out.println("This is a Shape");
}}
class Rectangle extends shape { 
  public  void show1(){ 
        System.out.println("This is Rectangle shape");
    }}
class Circle extends shape { 
     public void  show2(){ 
          System.out.println("This is a circle shape");
      }}
class square extends Rectangle {
   public void show(){ 
        System.out.println("Square is a Rectangle");
    }
}
    
public class Program;
    public static void main(String args[]){
   square s = new square (); 
    s.show();
    s.show1();


    }
    }
