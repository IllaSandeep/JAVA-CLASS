import java.util.*;
class Bubble 
{
    public static void bubble(int[] a,int n)
    {
        int temp,j;
        for(int k=1;k<n;k++)
        {
            for(int i=0;i<n-k;i++)
            {
                j=i+1;
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
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
        bubble(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",a[i]);
        }

    }
}