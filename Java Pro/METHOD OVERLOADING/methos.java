import java.util.*;
class methos
{
    static double area(double l,double b){
double m=l*b;
return m;
    }
static double area1(double l,double b){
return l*b;}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double l=sc.nextDouble();
double b=sc.nextDouble();
methos my=new methos();
double m=my.area(l,b);
double n=my.area1(l,b);
System.out.println(m*0.5);
System.out.println(n);
}}