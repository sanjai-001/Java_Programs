import java.util.*;
class revstr{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
char ch;
String b=" ";
for(int i=0;i<a.length();i++){
ch=a.charAt(i);
b=ch+b;}
System.out.print(b);
}}