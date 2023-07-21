import java.util.*;
class gcd{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int min=num1<num2 ? num1:num2;
while(min>=2){
if((num1%min==0)&&(num2%min==0)){
System.out.print(min);
break;
}
min--;}
}
}