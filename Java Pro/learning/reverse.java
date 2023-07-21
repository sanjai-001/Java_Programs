import java.util.*;
class reverse{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int rem;
while(num>0){
rem=num%10;
System.out.println(rem);
num=num/10;}}}