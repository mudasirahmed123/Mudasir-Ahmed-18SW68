import java.util.*;
class Populater
{
	Scanner sc=new Scanner(System.in);
	int a=0;
	{
		System.out.println("CHOOSE ANY STARTING ARRAY LENGTH:");
		a=sc.nextInt();
	}
	int []array=new int[a];
	public void populateArray()
	{
		for (int i=0;i<array.length;i++) 
		{
			System.out.println(i+" Enter Number of Array:");
			array[i]=sc.nextInt();
		}
	}
	public void chooseArray()
	{
	
		for (int i=0;i<array.length;i++) 
		{
			if (array[i]%2==0) 
			{
			System.out.println("The even numbers"+ array[i]);
			}
			else {
				System.out.println("Odd"+ array[i]);
			}
		}

	}
}
class Main
{
	public static void main(String[] args) 
	{
		Populater g1=new Populater();
		g1.populateArray();
		g1.chooseArray();
	}
}