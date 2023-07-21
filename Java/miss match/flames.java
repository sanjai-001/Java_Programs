import java.util.*;
class flames{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
int count=0;
int cow=0;
for(int i=0;i<a.length();i++){
if(a.charAt(i) !=' '){
count++;}}
for(int i=0;i<b.length();i++){
if(b.charAt(i) !=' '){
cow++;}}
System.out.println(count);
System.out.println(cow);
}}