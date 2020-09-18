import java.util.*;
class PrimeRange{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the low range");
	  int low=sc.nextInt();
	  System.out.println("enter the high range");
	  int high=sc.nextInt();
	  for(int i=low;i<=high;i++)
	   {
	      int count=0;
	      for(int j=1;j<=i/2;j++)
		    {
			  if(i%j==0)
			   {
				   System.out.println("mehul"); 
			      count++;
				  if(count>1)
				   {
				      break;
				   }
			   }
			}
			if(count==1)
			 {
			    System.out.println(i);
			 }
	   }
   }
   
}