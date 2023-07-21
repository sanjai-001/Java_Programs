import java.util.*;
class sum{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        a[i][j]=sc.nextInt();}}
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        System.out.print(a[i][j]+" ");}
      System.out.println();}
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        if((i==0&&j==0)||(i==1&&j==0)||(i==2&&j==0)){
          System.out.print("*");}
        else if(i==0&&j==1){
          System.out.print(a[0][0]+a[0][1]+a[0][2]);}
        else if(i==0&&j==2){
          System.out.print(a[0][1]-a[0][2]);}
        else if(i==1&&j==1){
          System.out.print(a[1][1]-a[1][2]);}
        else if(i==1&&i==2){
          System.out.print(a[1][1]+a[1][2]);}
        else if(i==2&&j==1){
          System.out.print(a[2][1]+a[2][2]);}
        else if(i==2&&j==2){
          System.out.print(a[2][1]-a[2][2]);}
        else {
          System.out.print(a[i][j]);}
      }System.out.println();}}}
    