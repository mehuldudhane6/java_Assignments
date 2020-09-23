import java.util.*;
class MathOperation{
   /* public static int sum(int num1,int num2){
	    return num1+num2;
	}
	
	public static int sub(int num1,int num2){
	    return num1-num2;
	}
	
	public static int mult(int num1,int num2){
	    return num1*num2;
	}*/
	
	public static int power(int num1,int num2){
		int power=1;
	    for(int i=0;i<num2;i++)
		{
			power=power*num1;
		}
		return power;
	}
}

class Demo{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
	   System.out.println("enter two numbers");
	   int num1=sc.nextInt();
	   int num2=sc.nextInt();
	   /*int result=MathOperation.sum(num1,num2);
	   System.out.println("sum= "+result);
	    result=MathOperation.sub(num1,num2);
	   System.out.println("sub= "+result);
	   result=MathOperation.mult(num1,num2);
	   System.out.println("mult= "+result);*/
	   int result=MathOperation.power(num1,num2);
	   System.out.println("power= "+result);
    
   }
}