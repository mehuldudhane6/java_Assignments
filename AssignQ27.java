import java.util.*;
class ArrayMaxMin{
      public static void main(String[] args)
	   {
	       Scanner sc=new Scanner(System.in);
		   System.out.println("enter the size of array elements");
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<arr.length;i++)
		    {
			   System.out.println("enter the array elemsnts");
			   arr[i]=sc.nextInt();
			   
			}
			int max=arr[0];
			int min=arr[0];
			for(int i=0;i<arr.length;i++)
			 {
			    if(arr[i]>=max)
                 {
				   max=arr[i];
				 }
                if(arr[i]<=min)
                 {
				    min=arr[i];
				 }				
			 }
			 
			 System.out.println("max element is= "+max);
			 System.out.println("min element is= "+min);
	   }

}