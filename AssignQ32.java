class Student1{
    private int rollno;
	private String sname;
	public static int count;
	public void set(){
	   rollno=1;
	   sname="mehul";
	   count=count+1;
	}
	
	public void show(){
	    System.out.println("Rollno= "+rollno);
		System.out.println("StudentName= "+sname);
		System.out.println("object created ="+Student1.count);
	}
}

class StudentDemo1{
    public static void main(String[] args){
	   Student1 s=new Student1();
	   s.set();
	   s.show();
	   Student1 s1=new Student1();
	   s1.set();
	   s1.show();
	   Student1 s2=new Student1();
	   s2.set();
	   s2.show();
	   
	}
}