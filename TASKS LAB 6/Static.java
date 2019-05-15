//6. Show the use of static keyword
class Static{
static int count=0;
Static(){
count ++;
}
public int getcount(){
return count;
}
}
class Main{
public static void main(String args[]){
Static ob=new Static();
System.out.println(ob.getcount());
Static s1=new Static();
Static s2=new Static();
Static s3=new Static();
Static s4=new Static();
System.out.println(s4.getcount());
}
}