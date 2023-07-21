import java.util.*;
class Loop{
int id;
String name;
Loop(int i,String n){
id=i;
name=n;}
void display()
{for(int i=1;i<15;i++){
System.out.println(id+" "+name);}}

public static void main(String[]args){
Loop s1=new Loop(111,"ram");

s1.display();
}}