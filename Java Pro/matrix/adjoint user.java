 import java.util.*;
class user
{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
int mat1[][]=new int[2][2];

for(int i=0;i<mat1.length;i++)
{
        for(int j=0;j<mat1.length;j++)
              {
                 mat1[i][j]=sc.nextInt();
}
}
for(int i=0;i<mat1.length;i++)
{
        for(int j=0;j<mat1.length;j++)
              {
System.out.print(mat1[i][j]+" ");
}System.out.println();
}
        for(int i=0;i<mat1.length;i++){
        for(int j=0;j<mat1.length;j++){
            if(i==0&&j==0){
                System.out.print(mat1[1][1]+ " ");
            }

else if(i==1&&j==1){
                System.out.print(mat1[0][0]+ " ");
            }
           else if(i==0&&j==1){
                System.out.print(-(mat1[0][1])+ " ");
            }
           else if(i==1&&j==0){
                System.out.print(-(mat1[1][0])+ " ");
            }

        }
    
        System.out.println();        
    }}
}