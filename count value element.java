import java.util.*;
class countele
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
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=-999;
                    c++;
                }
            }
            if(a[i]!=-999)
            {
                System.out.printf("%d %d\n",a[i],c+1);
            }
        }
    }
}