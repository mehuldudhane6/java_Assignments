/*
 48.	Create an Abstract class Processor with int member variable data  and method showData to display data value. Create abstract method process() to define processing of member data. Create a class  Factorial using abstract class Processor  to calculate and print factorial of a number by overriding the process method. b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method.Ask user to enter choice (factorial or circle area).  Also ask data to work upon. Use Processor class reference to achieve this mechanism.
*/
import java.util.*;
abstract class Processor{
        int data;
	    abstract void process();
	     void showData(){
	   
	   }
	   
	   void printFact(){
	      System.out.println("data= "+data);
	   }
	   void show(){
		    System.out.println("data= "+data);
		   
	   }
}
class Factorial extends Processor{
      void process(){
	       int result=1;
		   Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number");
		    int n=sc.nextInt();
	      for(int i=1;i<=n;i++)
		    {
			  result=result*i;
			}
		  data=result;
	  }
}

class Circle extends Processor{
      void process(){
            Scanner sc=new Scanner(System.in);
	       System.out.println("enter the radius of circle");
		    float r=sc.nextFloat();
		   
		   float area=(float)3.14*r*r;
		   data=(int)area;
		   
	  }
}

class Demo{
    public static void main(String[] args){
	   
		int ch;
		Scanner sc=new Scanner(System.in);
	    do{
		  System.out.println("enter the choice 1.factorial 2.Area 3.exit");
		   ch=sc.nextInt();
		   switch(ch){
		        case 1:
				       Processor p=new Factorial();
					   p.process();
					   p.show();
			    case 2 :
				       Processor p1=new Circle();
					   p1.process();
					   p1.show();
			    case 3 :
				        break;
		   }
		}while(ch!=3);
	
	}
}