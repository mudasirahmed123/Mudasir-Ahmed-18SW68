class Powe{
long pow=1;
public long power(int n,int p)throws Exception{
if(n>0 && p>0){
for(int i=1;i<=p;i++){
pow*=n;
}
}else{
throw new Exception("n and p are not negative");
}
return pow;
}
}
class Main{
public static void main(String args[]){
Powe ob=new Powe();
try{
long x=ob.power(2,7);
System.out.println(x);
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}
