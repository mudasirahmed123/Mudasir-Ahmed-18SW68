//2. Create a class book as shown in the class diagram. Four private instance variables: name (String), an array of authors (of
//the class Author you have just created), price (double), and qty (int);
// Two constructors:
//public Book (String name, Author[] author, double price) { ...... }
//public Book (String name, Author[] author, double price, int qty)
//{ ...... }
// public methods getName(), getAuthors(), getPrice(), setPrice(),
//getQty(), setQty().
// The toString() method shall return
//"Book[name=?,authors={Author[name=?,email=?,gender=?],......},
//price=?,qty=?]".
// Reuse Author class built in the first task//*



class Book
{
	private int qty;
	private String name;
	private double price;
	private Author []authors;
	Book(String name, Author []authors, double price)
	{
		this.name=name;
		this.authors=authors;
		this.price=price;
	}
	Book(String name, Author []authors, double price , int qty)
	{
		this.name=name;
		this.authors=authors;
		this.price=price;
		this.qty=qty;
	}
	public void setPrice(double pr)
	{
		price=pr;
	}
	public void setQty(int qt)
	{
		qty=qt;
	}
	public Author[] getAuthors()
	{
		return  authors;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQty()
	{
		return qty;
	}
	public String getName()
	{
		return name;
	}
	public String getAuthorName()
	{
		return " ";
	}
	public String toString()
	{
		String authorlist="";
		for(int i=0;i<authors.length;i++)
		{
			if (i<=2) 
				authorlist+=authors[i].toString()+",";
			else
				authorlist+=authors[i].toString();
		}
		return ("Book[name="+name+" , authors={"+authorlist+"} , price="+price+", Qty="+qty+"]");
	}
}
class UseBook
{
	public static void main(String[] args) 
	{
		Author auth1=new Author("Mudassir","ahmedmudassir392@gmail.com",'a');
		Author auth2=new Author("Noman","nomi@gmail.com",'b');
		Author auth3=new Author("Mudassiir","ahmedmudassir392@gmail.com",'c');
		Author auth4=new Author("Mudassir","ahmedmudassir392@gmail.com",'d');
		Author[] a1={auth1,auth2,auth3,auth4};
		Book b1=new Book("OOp",a1,1099,2876);
		System.out.println(b1.toString());
		System.out.println();
		System.out.println(auth3.toString());
	}
}