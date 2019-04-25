import java.util.*;

class Good{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int arr[]={1,2,3,4,5,6};
int count=0;
int position=0;
int find=0;
find=sc.nextInt();
for(int i=0;i<arr.length;i++){
if(find==arr[i]){
count =0;
position=i+1;
break;
}else
count++;
}
if(count==0){
System.out.println("The number found is="+ position);
}else
System.out.println("The number  is not found=");
}
}