import java.util.*;
class last{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=str.toCharArray();
int count=0;
for(int i=0;i<str.length();i++){
if(ch[i]==' '){
 count=0;
}
else{
count++;
}
}
System.out.print(count);
}
}