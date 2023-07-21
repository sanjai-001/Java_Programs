import java.util.*;
class str
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
int n=a.length();
if(n%2==0)
{
for(int i=1;i<n-1;i++)
{
System.out.print("*");
}
System.out.print(a);
for(int i=1;i<n-1;i++)
{
System.out.print("*");
}
}
if(n%2==1)
{
for(int i=0;i<n+1;i++)
{
System.out.print("*");
}
System.out.print(a);
for(int i=0;i<n+1;i++)
{
System.out.print("*");
}
}
else
{
System.out.println(" nothing ");
}
}
}