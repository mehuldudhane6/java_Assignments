[9:44 pm, 21/09/2020] manoj yadav cdac: import java.util.*;
class Employee{

       private int empId;
	   private String empName;
   
	   void setData(int empId,String empName){
	    
		//System.out.println("this "+this);
			this.empId=empId;
			this.emp
	   
	   void showData()
	   {
			System.out.println(empId+" "+empName);
	   }
}
class EmployeeDemo{
		public static void main(String[] args)
		{
			Employee e=new Employee();
			e.setName=empName;
	   }Data(1,"Manoj");
			e.showData();
			Employee e1=new Employee();
			e1.setData(2,"Mehul");
			e1.showData();
		}

}
[10:22 pm, 21/09/2020] manoj yadav cdac: class OneBHK{
		private float roomArea;
		private float hallArea;
		private double price;
		
		OneBHK(){
			
			roomArea=10;
			hallArea=20;
			price=450.0;
			
		}
		OneBHK(float roomArea,float hallArea,double price){
					this.roomArea=roomArea;
					this.hallArea=hallArea;
					this.price=price;
		}
		void show(){
			System.out.println(roomArea+" "+hallArea+" "+price);
		}

}
class TwoBHK extends OneBHK{
	
	private float roomArea2;
	
	TwoBHK(){
		super();
		roomArea2=500;
	}
	
	TwoBHK(float roomArea,float hallArea,double price,float roomArea2)
	{
		super(roomArea,hallArea,price);
		this.roomArea2=roomArea2;
	}
	
	void show(){
		super.show();
		System.out.println(roomArea2);
	}


}

class Demo1{
	
	public static void main(String args[]){
		
		TwoBHK t=new TwoBHK();
		t.show();
	}
}