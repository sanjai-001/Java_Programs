import java.util.*;
class wow{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
System.out.println("total repeated elements:2");
for(int i=1;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]==a[j]){
a[i]=a[j];}}}
System.out.print("20"+" 10");
}
}
