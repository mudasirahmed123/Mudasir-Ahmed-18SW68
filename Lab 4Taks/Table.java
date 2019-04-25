import java.util.*;
class Table{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please take a number");
int num=sc.nextInt();
System.out.println("Please take a starting number");
int x=sc.nextInt();
System.out.println("Please take a ending number");
int y=sc.nextInt();
for(int i=x;i<=y;i++)
{
System.out.println(num+ "*"+i+"="+num*i);
}
}
}