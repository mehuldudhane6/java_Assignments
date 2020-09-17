import java.util.*;
class AreaCircle{
    public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the radius of circle");
	    int rad=sc.nextInt();
		System.out.println("Area of circle="+(3.14*rad*rad));
		System.out.println("Perimetr of circle="+(2*3.14*rad));
	}
}