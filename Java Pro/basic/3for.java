import java.util.*;
class 3for
{
public static void main(String args[])
 {
scanner myobj=new scanner(system.in);
int a=myobj.nextInt();
if(a%3==0)
{
system.out.println("the number is  divisible by 3");
int sum=0;
for(int i=0;i<3;i++)
{ 
sum=sum+a;
}
system.out.println("sum is:"+sum);
if(sum>100)
{s
sum=1/1000;
system.out.println("the number is:" +sum);
}
if(sum<100)
{
sum=1/100;
system.out.println("the number is:" +sum);
}
if(sums<10)
{
int sum3=0;
sum3=sum/10;
system.out.println("the number is:"+sum3);
}

}
else
{
System.out.println("the number is not divisible by 3");
}
}
}