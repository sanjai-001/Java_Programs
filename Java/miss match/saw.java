import java.util.*;
class saw
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            int h=0;
            System.out.print(a[i][h]+" ");
        }
        for(i=2;i>=0;i--)
        {
            int h=1;
            System.out.print(a[i][h]+" ");
            
        }
        for(i=0;i<3;i++)
        {
            int h=2;
            System.out.print(a[i][h]+" ");
            
        }
        
    }
}