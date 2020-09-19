import java.util.*;
class ArraySum{
    public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
		 System.out.println("enter no. of rows");
		 int rows=sc.nextInt();
		 int arr[][]=new int[rows][];
		 int sum=0;
		 for(int i=0;i<rows;i++)
		  {
		     System.out.println("enter the no. of columns");
			 int cols=sc.nextInt();
			 arr[i]=new int[cols];
			 for(int j=0;j<arr[i].length;j++)
			  {
				  System.out.println("enter the elements");
				 arr[i][j]=sc.nextInt();
				 if((i+j)%2==0 && i==j)
				   {
				     sum=sum+arr[i][j];
				   }
			  }
		  }
		  
		  
		  System.out.println("sum of diagonal elements of 2D array="+sum);
	
	}
}