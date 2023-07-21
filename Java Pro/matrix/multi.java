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
class rec extends tri{
void display2()
    {
        Scanner r=new Scanner(System.in);
        int l=r.nextInt();
        int b=r.nextInt();
        int c=l*b;
        System.out.println(c);
    }
}

class multi
{
public static void main(String[]args)
{
rec r=new rec();
sc.display1();
r.display2();
}
} 
    