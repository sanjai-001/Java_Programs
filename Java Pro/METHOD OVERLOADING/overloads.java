class overloads{
 int plusmethod(int x,int y){
return x+y;}
 double plusmethod(double x,double y){
return x+y;}
public static void main(String[]args){
overloads a=new overloads();
 int m=a.plusmethod(8,5);
 double n=a.plusmethod(4.3,6.26);
System.out.println(m);
System.out.println(n);
}}