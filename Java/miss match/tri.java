import java.util.*;
public class tri {
public static void main(String[] args) {
int arr[][]={{0,1,0},{1,1,0},{1,1,1}};
for(int i =0; i<arr.length;i++) {
for(int j =0; j<arr.length;j++) {
System.out.print(arr[i][j]);
}
System.out.println();
}
int m =0;
int mcount =0;
for(int i =0;i<arr.length;i++) {
int ocount =0;
for(int j =0;j<arr.length;j++) {
if(arr[i][j]==1) {
ocount++;
}
}
if(ocount>mcount) {
mcount = ocount;
m = i;
}
}
System.out.println("ans:" + (m+1));
}
}