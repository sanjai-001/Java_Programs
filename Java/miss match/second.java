import java.util.*;
public class second {
public static void main (String[] args) {
Scanner pk = new Scanner(System.in);
String value = pk.nextLine();	
String arr[] = value.split(" ");
String dumy ="";
for(int i =arr.length-1;i>=0;i--) {
dumy += arr[i] + " ";	
}
System.out.println(dumy);
}
}