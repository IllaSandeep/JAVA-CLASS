import java.util.*;
class Binarysearch
{
    public static int binsrch(int[] a,int n,int s)
    {
        int l=0, h=n-1,m=(l+h)/2;
        while(l<=h)
        {
            if(s==a[m])
            {
                return 1;
            }
            if(s>a[m])
            {
                l=m+1;
                m=(l+h)/2;
            }
            if(s<a[m])
            {
                h=m-1;
                m=(l+h)/2;
            }
        }
        return 0;
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       int s=sc.nextInt();
       if(binsrch(a, n, s)==1)
       {
        System.out.println("YES");
       }
       else{
        System.out.println("NO");
       }
       
    }
}