//5. Create a class 'Student' with three data members which are name, age and
//address. The constructor of the class assigns default values name as
//"unknown", age as '0' and address as "not available". It has two members
//with the same name 'setInfo'. First method has two parameters for name and
//age and assigns the same whereas the second method takes has three
//parameters which are assigned to name, age and address respectively. Print
//the name, age and address of 10 students.
//Hint - Use array of objects 

import java.util.Scanner;
class Student 
{
	int age;
	String name;
	String address;
	Student()
	{
		age=0;
		name="Unknown";
		address="not available";
	}
	public void num(int age ,String name)
	{
		this.name=name;
		this.age=age;
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
		System.out.println("address: "+ address);
	}
	public void num(int age ,String name,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
		System.out.println("address: "+ address);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Student std1=new Student();
		Student std2=new Student();
		Student std3=new Student();
		Student std4=new Student();
		Student std5=new Student();
		Student std6=new Student();
		Student std7=new Student();
		Student std8=new Student();
		Student std9=new Student();
		Student std10=new Student();
		Student stu[]={std1,std2,std3,std4,std5,std6,std7,std8,std9,std10};
		std1.num(19,"Mudasir","Hyd");
		std2.num(20,"ahmed","hyd");
		std3.num(18,"NUM","Hyd");
		std4.num(19,"VCR","HYD");
		std5.num(10,"CR","HYD");
		std6.num(16,"BY","HYD");
		std7.num(19,"BILAL","HYD");
		std8.num(16,"JOHNN","HYD");
		std9.num(14,"BOKK","HYD");
		std10.num(18,"ARSALAN","HYD");
		for (int i=0;i<stu.length;i++) 
		{
			System.out.println();
			System.out.println("Student "+(i+1));
			stu[i].num(18,"mudasir","SW DEPTT");

		}
	}
}