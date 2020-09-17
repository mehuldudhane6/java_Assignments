import java.util.*;
class Temp{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
	   System.out.println("enter the temp in farenhrite");
	   int temp=sc.nextInt();
	   int tempInCelcius=5*(temp-32)/9;
	   System.out.println(tempInCelcius);
	   
   }
}