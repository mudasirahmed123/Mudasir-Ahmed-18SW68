class Student
{
	int age;
	String name;
	String rollNo;
	String dept;
	Student(String name,String rollNo,String dept,int age)
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
class Overlap
{
	Student std1;
	Marker mar;

	Overlap(Student s, Marker m){
		this.std1=s;
		this.mar=m;
	}

	public void createStudentResult()
	{
		mar.setDetails();
		std1.getDetails();
		mar.sum();
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Student std1=new Student("Mudassir","18Sw68","Software",18);
		Marker mar = new Marker();

		Overlap c=new Overlap(std1,mar);
		c.createStudentResult();
	}
}