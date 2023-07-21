import java.util.*;
class nameascii{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
int sum=0;
for(int i=0;i<name.length();i++){
char another=name.charAt(i);
int ascii=(int) another;
System.out.println("ASCII VALUE OF"+ another+"="+ascii);
sum=sum+ascii;}
System.out.println("TOTAL="+sum);
}}