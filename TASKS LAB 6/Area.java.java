
//4. Create a class to print the area of a square and a rectangle. The class has
//two methods with the same name but different number of parameters. The
//method for printing area of rectangle has two parameters which are length
//and breadth respectively while the other method for printing area of square
//has one parameter which is side of square.

class Area
{
	public void area(int corner)
	{
		System.out.println("Area of Square is: "+(corner*corner));
	}
	public void area(int length,int breadth)
	{
		System.out.println("Area of Rectangle is: "+(length*breadth));
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Area ob=new Area();
		ob.findarea(4);
		ob.findarea(4,9);
	}
}