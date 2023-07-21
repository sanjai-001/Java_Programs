import java.util.*;
class employee {
void display(){
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
int id=sc.nextInt();
int age=sc.nextInt();
String dept=sc.next();
long phonenum=sc.nextLong();
System.out.println("NAME:"+name);
System.out.println("ID:"+id);
System.out.println("AGE:"+age);
System.out.println("DEPARTMENT:"+dept);
System.out.println("PHONE NUMBER:"+phonenum);
System.out.println();}}
class employees{
public static void main(String[]args){
employee sc=new employee();
sc.display();
}}