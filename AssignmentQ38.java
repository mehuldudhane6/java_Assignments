import java.util.*;
class Employee{
   private static int count;
   private double salary;
   private static double Totsalary;
    private  int empNo;
   Employee(double salary){
	  this.count++;
      this.empNo=count;
	  this.salary=salary;
   }
   public static void countEmployee(){
	      
          System.out.println("total no. of employee= "+count);
   } 
   
   public static void totalSalary(Employee arr[]){
       for(int i=0;i<arr.length;i++){
	       Totsalary=Totsalary+arr[i].salary;
	   }
	   System.out.println("total="+Totsalary);
   }
   
}

class EmployeeDemo{
    public static void main(String[] args){
    Employee arr[]=new Employee[3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++){
	    System.out.println("enter salary");
		Double salary=sc.nextDouble();
		Employee e=new Employee(salary);
		arr[i]=e;
	}
	
	Employee.countEmployee();
	Employee.totalSalary(arr);
	}
}