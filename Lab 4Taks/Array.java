class Array{
public static void main(String args[]){
int arr[][]={{1,2,3},{4,5,6}};
int num[][]={{2,3,4},{4,5,6}};
int sum[][]=new int[2][3];
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++){
 sum[i][j]=arr[i][j]+num[i][j];
}
}

for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++){
 System.out.println(sum[i][j]);
}
}
}
}