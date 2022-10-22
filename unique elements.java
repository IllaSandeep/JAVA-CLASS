import java.util.*;
class uniq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0,f=1;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                f=1;
                System.out.format("%d ",a[i]);
            }
        }
        if(f==0)
        {
            System.out.print(-1);
        }
    }
}