import java.util.*;
class sa{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
String c=sc.nextLine();
String d=sc.nextLine();
String e=sc.nextLine();
int count=0;
int cow=0;
for(int i=0;i<a.length();i++){
for(int j=0;j<b.length();j++){
if((a.charAt(i)=='s'){
count++;}}
System.out.print(count);
for(int j=0;j<b.length();j++){
if((c.charAt(i)=='b'){
cow++;}}
System.out.print(cow);
}
}