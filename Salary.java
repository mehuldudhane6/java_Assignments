import java.util.*;
class Salary{
     public static void main(String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the basic salary");
		float bsal=sc.nextFloat();
		float hra=0;
		float da=0;
		if(bsal<10000)
		{
		   hra=0.10f*bsal;
		   da=0.90f*bsal;
		}
		else if(bsal>=1000){
		   hra=2000;
		   da=.98f*bsal;
		}
		float gs=bsal+hra+da;
		System.out.println("Gross salary="+gs);
		
	 }
}