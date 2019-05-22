class Person
{
	private String name;
	private String address;
	Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String toString()
	{
		return "Person name="+name+",address="+address+" ";
	}
}
class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	Student(String name,String address,String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public void setProgram(String program)
	{
		this.program=program;
	}
	public String getProgram()
	{
		return program;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public double getFee()
	{
		return fee;
	}
	public String toString()
	{
		return "Student"+super.toString()+",program="+program+",year="+year+",fee="+fee+" ";
	}
}
class Staff extends Person
{
	private String school;
	private int pay;
	Staff(String name,String address,String school,int pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public void setSchool(String school)
	{
		this.school=school;
	}
	public String getSchool()
	{
		return school;
	}
	public void setPay(int pay)
	{
		this.pay=pay;
	}
	public int getPay()
	{
		return pay;
	}
	public String toString()
	{
		return "staff "+super.toString()+",school="+school+",pay="+pay+" ";
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Student ob=new Student("Mudassir Ahmed","SW Muet Jamshoro","BE",2018,20000.0);
		Staff sc=new Staff("Mudassir","sw DEPTT","sT BONAVENTURE",300000);
		System.out.println(ob);
		System.out.println(sc);
	}
}