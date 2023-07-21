import java.util.*;
class prime{
public static void main(String[]args){
int n=12;
int i=2;
boolean prime=true;
while(i<n){
if(n%i==0){
i=i+1;
System.out.print("not prime");
prime=false;
}
else if(prime==true){
System.out.print(" prime ");}
}
}}