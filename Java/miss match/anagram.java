import java.util.*;
class anagram{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
if(s1.length()==s2.length()){
char[] chararray1=s1.toCharArray();
char[] chararray2=s2.toCharArray();
Arrays.sort(chararray1);
Arrays.sort(chararray2);
boolean result=Arrays.equals(chararray1,chararray2);
if(result){
System.out.println("THIS IS ANAGRAM");}
else{
System.out.println("THIS IS AN NOT ANAGRAM");}}
}}