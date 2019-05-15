//3. Create a class to print an integer and a character with two methods having
//the same name but different sequence of the integer and the character
//parameters.
//For example, if the parameters of the first method are of the form (int
//n, char c), then that of the second method will be of the form (char c,
//int n).

class Character
{
	public void ass(int a, char b)
	{
		System.out.println("Integer is: "+ a);
		System.out.println("Character is: "+ b);
	}
	public void ass(char b, int a)
	{
		System.out.println("Character is : "+ b);
		System.out.println("Integer is: "+ a);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Character ob=new Character();
		ob.ass(345,'m');
		ob.ass('n',987);
	}
}