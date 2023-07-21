public class inverse
{
    public static void main(String[]args) {
        int a[][]={{1,5},{2,4}};
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(i==0&&j==0){
                System.out.print(a[1][1]+ " ");
            }
else if(i==1&&j==1){
                System.out.print(a[0][0]+ " ");
            }
           else if(i==0&&j==1){
                System.out.print(-(a[0][1])+ " ");
            }
           else if(i==1&&j==0){
                System.out.print(-(a[1][0])+ " ");
            }
        }
        System.out.println(" ");        
    }
float d[][]=new float[2][2];
float c=(a[0][0]*a[1][1]-(a[0][1]*a[1][0]));
d[0][0]=a[1][1]/c;
d[1][1]=a[0][0]/c;
d[0][1]=a[0][1]/c;
d[1][0]=a[1][0]/c;
for(int i=0;i<d.length;i++){
        for(int j=0;j<d.length;j++){
System.out.print(d[i][j]+" ");}
System.out.println();
}
}
}