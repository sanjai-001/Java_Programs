import java.util.*;
class vowels{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
for(int i=0;i<s1.length();i++){
if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u')){
System.out.print(s1.charAt(i));}}
}
}