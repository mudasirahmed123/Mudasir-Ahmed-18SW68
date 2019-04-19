import java.util.*;
class Add{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers=");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter any operator");
String s1=sc.next();
int sum=0;
if(s1.equals("+"))
sum=a+b;
//System.out.println("Sum is"+(a+b));
else if(s1.equals("-"))
sum=a-b;
//System.out.println("Sum is"+(a-b));
else if(s1.equals("*"))
sum=a*b;
//System.out.println("SUM IS"+(a*b));
else if(s1.equals("/"))
sum=a/b;
//System.out.println("Sum is"+(a/b));
System.out.println(sum);
}
}
 