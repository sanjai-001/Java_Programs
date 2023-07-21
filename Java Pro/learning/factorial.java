import java.util.*;
class fac{
void display(){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int fact=a;
while(a>1){
a--;
fact=fact*a;
}
System.out.print(fact);
}}
class factorial{
public static void main(String[]args){
fac sc=new fac();
sc.display();}}