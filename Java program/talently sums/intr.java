import java.util.*;
class intr{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int q=sc.nextInt();
int i=1;
System.out.print(n+" ");
System.out.print(q);
System.out.println("");
while(i<=n){
if(i==1){
i=i*i*q%10^9+7;
i++;}}
System.out.println(i);
}}