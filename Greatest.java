import java.util.*;
class Greatest
{
	public static void main(String[] args)
	{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter three no.");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   String ans=(a>b)?((a>c)?a+" is greater ":c+" is greater"):((b>c)?b+" is greater":c+" is greater");
   System.out.println(ans);
	}
}