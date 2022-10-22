import java.util.*;
class Solution
{
    static int prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        for(int i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(prime(i)==1)
            {
                System.out.printf("%d ",i);
            }
        }
    }
}
