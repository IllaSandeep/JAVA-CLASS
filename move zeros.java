import java.util.*;
class move
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
        int j=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==0)
                {
                    j=i;
                    break;
                }
            }
        for(int i=j+1;i<n;i++)
        {
            if(a[i]==1)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",a[i]);
        }
    }
}