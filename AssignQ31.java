class Student{
    private int rollno;
	private String sname;
	
	public void set(){
	   rollno=1;
	   sname="mehul";
	}
	
	public void show(){
	    System.out.println("Rollno= "+rollno);
		System.out.println("StudentName= "+sname);
	}
}

class StudentDemo{
    public static void main(String[] args){
	   Student s=new Student();
	   s.set();
	   s.show();
	}
}