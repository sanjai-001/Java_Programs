import java.util.*;
public colours {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  System.out.print("Enter number of socks:");
  int n=sc.nextInt();
  int a[]= new int[n];
  int freq[]=new int[a.length] ;
  int i=0,j=0,count=0;
  for(i=0;i<a.length;i++)
  {
  a[i]=sc.nextInt();
  }
  for(i=0;i<a.length;i++)
{
  int no=a[i];
  count=1;
  for(j=i+1;j<a.length;j++)
  {
  if(no==a[j])
  {
  count++;
  freq[j]=-1;
  }
  }
  if(freq[i]!=1)
  {
  freq[i]=count;
  }
 }
  int countofduplicate=0;
  for(i=0;i<freq.length;i++)
  {
  if(freq[i]>1)
  {
  countofduplicate++;
  }
  }
  if(countofduplicate%2!=0)
  {
  System.out.print(countofduplicate-2);
  }
  else if(countofduplicate%2==0)
  {
  System.out.print("mathching pairs of socks is:"+countofduplicate);
  }
  }
  }
