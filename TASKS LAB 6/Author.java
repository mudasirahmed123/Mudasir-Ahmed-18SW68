// 1. Make a class called Author (as shown in the class diagram). It is designed to
//model a book's author. It contains:
//? Three private instance variables: name (String), email (String), and
//gender (char of either 'm' or 'f');
//? One constructor to initialize the name, email and gender with the given
//values;
//public Author (String name, String email, char gender) {......}
//(There is no default constructor for Author, as there are no defaults for
//name, email and gender.)
//? public getters/setters: getName(), getEmail(), setEmail(), and
//getGender();
//(There are no setters for name and gender, as these attributes cannot be
//changed.)
//? A toString() method that returns "Author[name=?,email=?,gender=?]",
//e.g., "Author[name=Tan AhTeck, email=ahTeck@somewhere.com,
//gender=m]
class Author
{
	private String name;
	private String email;
	private char gender;
	Author(String name, String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return ("Author[name="+name+" , "+"email="+email+" , "+"gender="+gender+"]");
	}
}
class UseAuthor
{
	public static void main(String[] args) 
	{
		Author ob=new Author("name=Tan AhTeck","email=ahTeck@somewhere.com",'m');
		//ob.setEmail("Mudassir89@gmail.com");
		System.out.println(ob.toString());
	}
}