/*4. Create a Student class that stores student data, provides methods for
initializing and displaying student data. Also provide a parameterized
constructor for initializing student class data members.*/

class Aspirant
{
	int age;
	String name;
	String rollNo;
	String dept;
	Aspirant(String name,String rollNo,String dept,int age)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.dept=dept;
		this.age=age;
	}
	public void getDetails()
	{
		System.out.println("Name of Student: "+name);
		System.out.println("Roll Number:  "+rollNo);
		System.out.println("Department:  "+dept);
		System.out.println("Age of Student: "+age);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Aspirant std1=new Aspirant("Mudassir","18SW68","Software",18);
		std1.getDetails();
	}
}