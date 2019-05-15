//6. Show the use of static keyword
class Sta{
static int a=0;
public void add(){
a++;
System.out.println(a);
}
}
class Main{
public static void main(String args[]){
Sta ob=new Sta();
ob.add();
ob.add();
}
}
