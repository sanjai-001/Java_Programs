import java.util.*;
class tri
{
    void display1()
    {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println(0.5*(breadth*height));
    }}
class rec{
void display2()
    {
        Scanner r=new Scanner(System.in);
        int l=r.nextInt();
        int b=r.nextInt();
        int c=l*b;
        System.out.println(c);
    }
}
class cir{
void display3()
    {
        Scanner ci=new Scanner(System.in);
        int R=ci.nextInt();
        System.out.println(3.14*R*R);
    }
}
class area
{
public static void main(String[]args)
{
tri sc=new tri();
rec r=new rec();
cir ci=new cir();
sc.display1();
r.display2();
ci.display3();
}
} 
    
