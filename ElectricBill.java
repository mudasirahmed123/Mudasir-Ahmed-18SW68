import java.util.*;
class ElectricBill{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of units:");
int unit=sc.nextInt();
int total=0;
for(int i=1;i<=unit;i++){
if(i<=50)
total=total+10;
else if(i>50 && i<=100)
total=total+15;
else if(i>100 && i<=200)
total=total+20;
else if(i>200 && i<=300)
total=total+25;
else if(i>300)
total=total+30;
}
System.out.println(total);
}
}
