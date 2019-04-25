import java.util.*;
class Main{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int number=0;
int sum=0;
System.out.println("How manynumbers you want to add?");
number=sc.nextInt();
System.out.println("Ener any number");
for(int i=1;i<=number;i++){
int a=sc.nextInt();
sum=sum+a;
}
System.out.println("Sum of all n integer numbers"+ sum);

}
}