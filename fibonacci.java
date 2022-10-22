import java.util.*;
class Sol2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c,s=0;

        for(int i=1;i<n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
            if(c%2==0)
            {
                s+=c;
            }
        }
        System.out.println(s);
    }
}