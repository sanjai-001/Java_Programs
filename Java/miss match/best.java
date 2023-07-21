import java.util.*;
class best{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
String c=sc.nextLine();
int count=0;
int cow=0;
int bow=0;
for(int i=0;i<a.length();i++){
if(a.charAt(i)=='w'){
count++;}}
System.out.println(count);
for(int j=0;j<b.length();j++){
 if(b.charAt(j)=='w'){
cow++;}}
System.out.println(cow);
for(int k=0;k<c.length();k++){
 if(c.charAt(k)=='w'){
bow++;}}
System.out.println(bow);
}}