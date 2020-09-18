import java.util.*;
class ArrayTotal{
   public static void main(String[] args)
    {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the size of arrayy1");
	   int n=sc.nextInt();
	   int arr[]=new int[n];
	   int oddTotal=0;
	   int evenTot=0;
       for(int i=0;i<arr.length;i++)
        {
		   arr[i]=sc.nextInt();
		}
	   for(int j=0;j<arr.length;j++)
	    {
		   if(arr[j]%2==0)
		     {
			   evenTot=evenTot+arr[j];
			 }
			 else{
			    oddTotal=oddTotal+arr[j];
			 }
		}
		
		System.out.println("sum of even elements= "+evenTot);
		System.out.println("sum of odd elements= "+oddTotal);
	}
	}