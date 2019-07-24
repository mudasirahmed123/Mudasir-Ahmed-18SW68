class Final
{
	final public void demo()
	{
		System.out.println("We can't Override ");
	}
}
class Mid extends Final
{
	 void demo()
	{
		System.out.println(" Final Overridden method ");
	}
}
	class Main{
	public static void main(String[] args) 
	{
		Mid ob=new Mid();
		ob.demo();
	}
	}