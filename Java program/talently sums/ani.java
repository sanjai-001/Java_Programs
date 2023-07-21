import java.util.*;
class ani{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();
if(i==2){
int sum=a[2]+1;
System.out.print(sum);
}
}}}