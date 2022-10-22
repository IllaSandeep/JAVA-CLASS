import java.util.*;
class Sol
{
    public static int digcount(int n)
    {
        int c=0;
        while(n!=0)
        {
            n=n/10;
            c+=1;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int d=digcount(n);
        int s=0;
        int temp=n;
        while(n!=0)
        {
            i=n%10;
            n=n/10;
            s+=Math.pow(i,d);
        }
        if(s==temp)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}