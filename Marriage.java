import java.util.*;

class Marriage{
    public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
		 System.out.println("enter your gender(m/f)");
		 char gender=sc.next().charAt(0);
		 System.out.println("enter your age");
		 
		 int age=sc.nextInt();
		 if(gender=='m' && age>21)
		 {
		    System.out.println("men eligible for marraige");
		 }
		 else if(gender=='f' && age>18){
		    System.out.println("women eligible for marriage");
		 }
		 else{
		    System.out.println("not  eligible for marriage");
		 }
		   
		 
	}
}