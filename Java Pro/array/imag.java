import java.util.*;
class real{
void display(){
class imag{
public static void main(String[]args){
real my=new real();
Scanner sc=new Scanner(System.in);
int a[][]=new int[2][2];
int b,c;
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length;j++){
a[i][j]=sc.nextInt();}}
System.out.println("addition:");
b=a[0][0]+a[1][0];
c=a[0][1]+a[1][1];
System.out.println(b+"+"+c+"i");
System.out.println("subraction:");
System.out.println((a[0][0]-a[1][0])+"+"+(a[0][1]-a[1][1])+"i");
System.out.println("multiply:");
System.out.println((a[0][0]*a[1][1])+(a[0][1]*a[1][0])+"+"+((a[0][0]*a[1][1])+(a[0][1]*a[1][0]))+"i");
my.display();}
}}}