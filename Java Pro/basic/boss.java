import java.util.*;
class boss
{
public static void main(String args[])
 {
Scanner myobj=new Scanner(System.in);
int a=myobj.nextInt();
if(a%3==0)
{
System.out.println("the number is  divisible by 3");
int sum=0;
for(int i=0;i<3;i++)
{ 
sum=sum+a;
}																						
System.out.println("sum is:"+sum);
if(sum>100)
{
sum=sum/1000;
System.out.println("the number is:"+sum);
}
if(sum<100)
{
sum=sum/100;
System.out.println("the number is:"+sum);
}
if(sum<10)
{
int sum3=0;
sum3=sum/10;
System.out.println("the number is:"+sum3);
}

}
else
{
System.out.println("the number is not divisible by 3");
}
}
}