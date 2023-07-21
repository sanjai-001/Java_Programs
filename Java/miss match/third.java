import java.util.*;
class third{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b[]=a.split("//a");
String c=" ";
for(String d:b){
String firstletter=d.substring(0,1)(1,1)(2,1);
String remainingletters=d.substring(1);
c=firstletter.toUpperCase()+remainingletters+" ";}
System.out.print(c);
}}