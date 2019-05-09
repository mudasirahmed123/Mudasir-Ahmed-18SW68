class Dog
{
	String name;
	String breed;
	int age;
	public void setDetails(String name,String breed,int age)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	public void showDetails()
	{
		if (age==0) 
		{
			System.out.println("Details are unavailable");
		}else {
			System.out.println("Name of Dog: "+ name);
			System.out.println("Breed of Dog: "+ breed);
			System.out.println("Age of Dog: "+ age);
		}
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Dog dog1=new Dog();
		dog1.setDetails("Street dOG","Unavailable/Not found",10);
		dog1.showDetails();
	}

} 