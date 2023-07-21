import java.util.*;
class cross{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length;j++){
a[i][j]=sc.nextInt();
}}
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length;j++){
if((i==0&&j==0)||(i==0&&j==2)||(i==2&&j==0)||(i==2&&j==2))
System.out.print(a[i][j]+a[1][1]+" ");
else if((i==1&&j==1)){
System.out.print(a[i][j]+" ");}
else if(i==0&&j==1){
int b=a[0][1]+a[0][0];
if(b>9){
System.out.print("D ");}
else{
System.out.print("S ");}}
else if(i==2&&j==1){
int b=a[2][1]+a[2][0];
if(b>9){
System.out.print("D ");}
else{
System.out.print("S ");}}
else if(i==1&&j==0){
int b=a[1][0]+a[2][1];
if(b>9){
System.out.print("D ");}
else{
System.out.print("S ");}}
else if(i==1&&j==2){
int b=a[1][2]+a[0][1];
if(b>9){
System.out.print("D ");}
else{
System.out.print("S ");}}
}
System.out.println();}
}}