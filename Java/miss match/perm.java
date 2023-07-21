import java.util.*;
class perm{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=sc.nextInt();
int f1=1,f2=1,permutation,number;
for(int i=1;i<=n;i++){
f1=f1*i;
}
number=n-r;
for(int i=1;i<=number;i++){
f2=f2*i;
}
permutation=f1/f2;
System.out.print(permutation);
}}