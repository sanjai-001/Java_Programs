import java.util.*;
class Emoployee{

    void getinfo(int a,int b)
    {
        int sal=a;
        int hr=b;
    }
    void Addsal(int a)
    {int sal=a;
        if (sal<500)
        {
            
            System.out.println(sal+=10);
        }
    }
    void Addwork(int b)
    {int sal=b;
        if (sal>6)
        {
            System.out.println(sal+=5);
        
        }
    }

}



public class salary {
    public static void main(String args[])
    {
       Scanner sc =new Scanner(System.in);
       int salary=sc.nextInt();
       int hour =sc.nextInt(); 
       Emoployee obj=new Emoployee();
       obj.getinfo(salary,hour);
       obj.Addsal(salary);
       obj.Addwork(hour);
    }
    

    
}