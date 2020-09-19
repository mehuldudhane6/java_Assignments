import java.util.*;
class StringArray{
    public static void main(String[] aargs)
	  {
	     Scanner sc=new Scanner(System.in);
		 System.out.println("enter thr size of array");
		 int n=sc.nextInt();
		 String str[]=new String[n];
		 System.out.println("enter array elements");
		 for(int i=0;i<n;i++)
		  {
		      str[i]=sc.nextLine();
		  }
		  
		  for(String a:str)
		    {
			   System.out.println(a);
			}
		 
	  }
}