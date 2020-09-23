/*
   44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )

*/
import java.util.*;
class Faculty{
    private int facultyId;
	private double salary;
	
	public void input(int facultyId){
	     this.facultyId=facultyId;
	}
	public void input(){
		
		
	}
	public void input(double basicSalary,double allownace){
		 
		 this.salary=(basicSalary+allownace);
	}
	
	public void printSalary(){
	    System.out.println("facultyid="+facultyId+" "+"salary="+salary);
	}
}

class FulltimeFaculty extends Faculty{
      private double basicSalary;
	  private double allownace;
	  
	  
	  public void input(int facultyId){
		   super.input(facultyId);
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter the basic salary");
		   double basicSalary=sc.nextDouble();
		    System.out.println("enter the allowance");
		   double allownace=sc.nextDouble();
	       super.input(basicSalary,allownace);
	  
	  }
	  
}

/*class PartTimeFaculty extends Faculty{
       private double workingHours;
		private double ratePerHour;
		
		public void input(){
		     
		}
}*/

class Demo{

    public static void main(String[] args){
	        Faculty f=new FulltimeFaculty();
			f.input(1); 
			f.printSalary();
	
	}
}