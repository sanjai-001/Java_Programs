package test;
import java.util.*;

public class thirds {
public static void main(String[] args) {
Scanner pk = new Scanner(System.in);
int row = pk.nextInt();
int col = pk.nextInt();
int arr[][] = new int [row][col];
for(int i =0; i<row;i++) {
for(int j =0; j<col;j++) {
arr[i][j]=pk.nextInt();
System.out.print(arr[i][j]);
}
System.out.println();
}
}}