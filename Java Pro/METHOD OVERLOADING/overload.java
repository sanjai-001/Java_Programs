class overload{
static int plusmethod(int x,int y){
return x+y;}
static double plusmethod(double a,double b){
return a+b;}
public static void main(String[]args){
int a=plusmethod(8,5);
double b=plusmethod(4.3,6.26);
System.out.println(a);
System.out.println(b);}}
