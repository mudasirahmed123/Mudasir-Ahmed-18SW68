class Define{
public static void main(String args[])
{
int arr[]={1,2,3,4,5};
int a=0;
int b=0;
for(int i=0;i<arr.length;i++){
if (arr[i]>a){
a=arr[i];
b=i+1;
}
}
System.out.println("the largest number is="+ a);
System.out.println("the Index  is="+ b);
}
}