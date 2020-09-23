import java.util.*;
class Circle{
  private double radius;
  private double area;
    
	 public void init(){
	    Scanner sc=new Scanner(System.in);
		 System.out.println("enter the radiud of circle");
		 radius=sc.nextDouble();
	 }
	 
	 public void calculateArea(){
	      area=3.14*radius*radius;
	 }
	 
	 public void display(){
	     System.out.println("radius of circle="+radius);
		 System.out.println("area of circle="+area);
	 }
	

}
class Area{
    public static void main(String[] args){
	       Circle c=new Circle();
		   c.init();
		   c.calculateArea();
		   c.display();
	}
}