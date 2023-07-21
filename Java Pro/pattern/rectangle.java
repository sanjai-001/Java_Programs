import java.util.*;
class rectangle
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
if(n>m){
for(int i=0;i<n;i++)
{
System.out.print("*");
}
System.out.println(" ");
for(int i=0;i<m;i++)
{
System.out.print("*\n");
if(n%2==0)
{
for(int j=0;j<m;j++)
{
System.out.print("");
}}
else
{
for(int j=0;j<=m;j++)
{
System.out.print(" ");
}}
System.out.println("*");
}
for(int i=0;i<n;i++)
{
System.out.print("*");
}
System.out.println(" ");
}
}}