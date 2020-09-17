import java.util.*;
class Percentage{
	
    public static void main(String[] args)
	{
		int total=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the mark of subject");
	  
	   for(int i=0;i<5;i++){
	        int marks=sc.nextInt();
	        total=total+marks;
	   }
	   
	    System.out.println("Percentage Marks="+(total/5));
	}

}