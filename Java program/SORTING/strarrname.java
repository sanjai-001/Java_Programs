import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class strarrname{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String a[]=new String[3];
for(int i=0;i<a.length;i++){
a[i]=sc.nextLine();}
Arrays.sort(a,Collections.reverseOrder());
System.out.println("answer:"+Arrays.toString(a));
}}