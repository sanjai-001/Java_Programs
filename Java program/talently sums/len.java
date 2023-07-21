import java.util.*;
class len{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int p=sc.nextInt();
int a=n+m;
a=a-p;
if(0>a){
System.out.print(-1*a);}
else{
System.out.print(a);}
}}