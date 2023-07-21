import java.util.*;
class rec{
int length;
int breadth;
     rec(int l,int b){
length=l;
breadth=b;}
      void display1(){
        System.out.println("answer:"+(breadth*length));
    }}
class sqr{
int ar;
sqr(int a){
ar=a;}
void display2()
    {
        System.out.println("AREA OF SQR:"+(ar*ar));
    }
}
class cir{
int radius;
cir(int r){
radius=r;}
void display3()
    {
       System.out.println("AREA OF CIRCLE:"+((3.14*radius*radius)));
    }
}
class constructor
{
public static void main(String[]args)
{
Scanner my=new Scanner(System.in);
int l=my.nextInt();
int b=my.nextInt();
int a=my.nextInt();
int r=my.nextInt();
rec s1=new rec(l,b);
sqr s2=new sqr(a);
cir s3=new cir(r);
s1.display1();
s2.display2();
s3.display3();
}
} 
    
