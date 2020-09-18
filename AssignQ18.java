import java.util.*; 
class Prime{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
	   System.out.println("enter the no.");
	   int num=sc.nextInt();
	   int count=0;
	   for(int i=1;i<num/2;i++)
	   {
	   if(num%i==0)
	     {
	        count++;
		 }
	   }
	   if(count==1)
	   {
	     System.out.println(num+" is prime no.");
	   }
	   else{
	      System.out.println(num+"  is not prime no.");
	   }
   }
}