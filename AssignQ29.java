import java.util.*;
class ArrayEle1{
    public static void main(String[] args)
	  {
	      Scanner sc=new Scanner(System.in);
		  System.out.println("enter no. of rows");
		  int rows=sc.nextInt();
		  int arr[][]=new int[rows][];
		  int total=0;
		  for(int i=0; i<arr.length;i++)
		   {
		     System.out.println("enter the cols for the row"+i);
			 int cols=sc.nextInt();
			 arr[i]=new int[cols];
		     for(int j=0;j<arr[i].length;j++){
			      System.out.println("enter the col"+j+"element");
			      arr[i][j]=sc.nextInt();
			 }
		   }
		   for(int i=0;i<arr.length;i++)
		    {
			   int count=0;
			   for(int j=0;j<arr[i].length;j++)
			     {
				    count++;
				       
				 }
				 System.out.println("total no. of elements in "+i+" 1-D elements="+count);
			}
			
		  System.out.println("total no. of 2-D elements="+rows); 
		  
	  
	  }
}