import java.util.*;
class MarkSheet{
public static void main(String args[])
{
int sub1,sub2,sub3;
Scanner sc=new Scanner(System.in);
int total=300;
System.out.println("Enter marks in C++:");
sub1=sc.nextInt();
System.out.println("Enter marks in Operating Systems:");
sub2=sc.nextInt();
System.out.println("`Enter marks in Data Structures:");
sub3= sc.nextInt();
int obtMarks=sub1+sub2+sub3;
double percentage=(obtMarks*100)/total;
if(percentage>=90){
System.out.println("You have obtained A grade");
}
if(percentage<=90 && percentage>=80){
System.out.println("Your grade is B");
}
if(percentage<80 && percentage>=70){
System.out.println("Your grade is C");
}
if(percentage<70 && percentage>=60){
System.out.println("yOU HAVE OBTAINED d grade");
}
if(percentage<60)
System.out.println("yOU ARE FAIL");

}
}
