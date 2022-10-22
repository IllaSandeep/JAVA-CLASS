import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        double avg;
        avg=(a+b+c+d+e)/5;
        if(avg<a)
        {
            System.out.println(a);
        }
        if(avg<b)
        {
            System.out.println(b);
        }
        if(avg<c)
        {
            System.out.println(c);
        }
        if(avg<d)
        {
            System.out.println(d);
        }
        if(avg<e)
        {
            System.out.println(e);
        }

    }
}