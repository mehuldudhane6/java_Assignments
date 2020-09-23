class Person{
   int age;
   String name;
   Person(){
      age=18;
   }
   
   Person(String name){
      this();
      this.name=name;
   }
   
   public void show(){
      System.out.println("name="+name+" "+"age="+age);
   }
}

class Demo{
   public static void main(String[] args){
      Person p=new Person("mehul");
	  p.show();
	  Person p1=new Person("manoj");
	  p1.show();
   }
}