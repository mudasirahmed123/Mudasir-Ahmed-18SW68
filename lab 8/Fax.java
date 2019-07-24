//Task 1: Create an interface AdvancedArithmetic which contains a
method signature int sumOfFactors(int n). You need to write a class
called MyCalculator which implements the interface.
sumOfFactors function just takes an integer as input and return the
sum of all its factors. For example factors of 6 are 1, 2, 3 and 6, so
sumOfFactors should return 12. The value of n will be at most 1000




import java.util.*;
interface AdvancedArithmetic
{
    public int sumOfFactors(int n);
}
class SumOfFactors implements AdvancedArithmetic
{
    public int sumOfFactors(int n)
    {
        int i=1;
        int sum=0;
        while(i<=n)
        {
            if(n%i==0)
            sum=sum+i;
            i++;
        }
        return sum;
    }
}
class Main{
    public static void main(String args[])
    {
        SumOfFactors f=new SumOfFactors();
        Scanner sc=new Scanner(System.in);
        System.out.println("Plase Enter a Number");
        int n=sc.nextInt();
        System.out.println("Sum of Factors of  "+n+"  are: "+f.sumOfFactors(n));
    }
}