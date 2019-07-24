class teen extends Exception{
teen(String s){
super(s);
}
}
class Vitara{
String[] c;
int[]count;
public void addcandidate(String[]name){
c=name;
count=new int[name.length];
}
public void castVote(String name,int age){
for(int i=0;i<c.length;i++){
if(name.equals(c[i])){
count[i]++;
}
}
}
public void showresult(){
for(int i=0;i<c.length;i++){
System.out.println("Voters casted for "+c[i]+" are"+count[i]+".");
}
}
}
class Main{
public static void main(String args[])throws teen{
Vitara ob=new Vitara();
String name[]={"John","Nick","Mudassir"};
ob.addcandidate(name);
int age=18;
try{
if(age<18){
throw new teen("be mature");
}
else
ob.castVote("John",age);
ob.castVote("Nick",age);
ob.castvote("Mudassir",age);
}
catch(Exception e){
System.out.println("*");
}
ob.showresult();
}
}


