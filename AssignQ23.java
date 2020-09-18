import java.util.*;
class ArrayRev{
   public static void main(String[] args)
    {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the size of arrayy1");
	   int n=sc.nextInt();
	   int arr[]=new int[n];
       for(int i=0;i<arr.length;i++)
        {
		   arr[i]=sc.nextInt();
		}
		for(int j=arr.length-1;j>=0;j--)
		 {
		    System.out.println(arr[j]);
		 }
	}
		
}