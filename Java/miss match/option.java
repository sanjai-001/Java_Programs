import java.util.*;
class option{
public static void main(String[]args){
System.out.println("I Love Rathinam");
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int a=sc.nextInt();
String d=" ";
switch(a){
case 1:
d=s1;
break;
case 2:
d=s2;
break;
default:
System.out.println("INVALID");
}
System.out.println("I " +d+ " Rathinam");
if(d==s1){
System.out.println("Rathinam staffs love is 20% correct");}
else{
System.out.print("Rathinam staffs hate is 100% correct");}
}}
