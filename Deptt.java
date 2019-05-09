class Deptt
{
	public static void main(String[] args) 
	{
		String stri="Mudassir Ahmed,18,SWE;Danish,19,ES";
		String sc[]=stri.split(";");
		String stri1[]=sc[0].split(",");
		String stri2[]=sc[0].split(",");
		System.out.println("Student 1");
		System.out.println("Name: "+ stri1[0]);
		System.out.println("Age: "+ stri1[1]);
		System.out.println("Deptt: "+ stri1[2]);
		System.out.println("Student 2");
		System.out.println("Name: "+ stri2[0]);
		System.out.println("Age: "+ stri2[1]);
		System.out.println("Deptt: "+ stri2[2]);
	}
	}