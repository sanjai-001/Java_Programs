import java.util.*;
class insert{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a[]=new int[6];
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();}
int pos=sc.nextInt();
int value=sc.nextInt();
a = insertx(6,a,value,pos);
System.out.print(Arrays.toString(a));
}}