class Circle
{
	private double radius;
	private String color;
	final double pi=3.14;
	public double area;
	Circle()
	{
		radius=5.0;
		color="blue";
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius, String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public Double getArea()
	{
		area=pi*radius*radius;
		return area;
	}
	public String toString()
	{
		return "Circle radius="+radius+",color="+color+" ";
	}
}
class Cylinder extends Circle
{
	double volum;
	private double height;
	Cylinder()
	{
		height=1.0;
	}
	Cylinder(double radius)
	{	
		this.setRadius(radius);
	}
	Cylinder(double radius, String color)
	{
		super(radius,color);
	}
	Cylinder(double radius, String color,double height)
	{
		super(radius,color);
		this.height=height;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double getVolume()
	{
		volum=pi*this.getRadius()*this.getRadius()*height;
		return volum;
	}
	public String toString()
	{
		return "Cylinder "+super.toString()+" height="+height+" ";
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Circle ob=new Circle();
		ob.setRadius(7.8);
		System.out.println(ob);
		System.out.println("Area of Circle: "+ob.getArea());
		Cylinder sc=new Cylinder(2.5);
		sc.setHeight(9);
		System.out.println(sc);
		System.out.println("Volume of Cylinder: "+sc.getVolume());
	}
}