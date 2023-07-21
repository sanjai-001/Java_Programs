class box
{
double width;
double height;
double depth;
double volume;
}
class boxdemo
{
public static void main(String[]args)
{
box sc=new box();
double volume;
sc.width=10;
sc.height=20;
sc.depth=15;
volume=sc.width*sc.height*sc.depth;
System.out.println(" volume is:" +volume);
}
}