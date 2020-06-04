import java.util.*;
public class first
{
    public static void main(String args[])
    {
        int r=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=ob.nextInt();
        for(int i=num;i>0;i=i/10)
        {
            int d=i%10;
            r=r*10+d;
        }
        System.out.println(r);
    }
}
