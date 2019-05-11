import java.util.*;
class Marker
{
	Scanner sc=new Scanner(System.in);
	int sub;
int sub1;
int sub2;
int sub3;
int aggregate;
	float per;
	public void setDetails()
	{
		System.out.println("Enter Marks in First subject");
		sub1=sc.nextInt();
		System.out.println("Enter Marks in 2nd subject");
		sub2=sc.nextInt();
		System.out.println("Enter Marks in 3rdsubject");
		sub3=sc.nextInt();
		System.out.println("Enter Total Marks");
		aggregate=sc.nextInt();
	}
	public void sum()
	{
		System.out.println("Total marks: "+ aggregate);
		System.out.println("Obtained Marks: "+(sub1+sub2+sub3));
		sub=sub1+sub2+sub3;
		per=(sub*100)/aggregate;
		System.out.println("Percentage: "+per);
		if (per>=90) 
			System.out.println("Grade 'A'");
		if (per>=80 && per<90) 
			System.out.println("Grade 'B'");
		if (per>=70 && per<80) 
			System.out.println("Grade 'C'");
		if (per>=60 && per<70)
			System.out.println("Grade 'D'");
		if (per>=50 && per<60) 
			System.out.println("Grade 'E'");
		if (per<=50) 
			System.out.println("Alas!YOU ARE Fail");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Marker ob=new Marker();
		ob.setDetails();
		ob.sum();
	}
}