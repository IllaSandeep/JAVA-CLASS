import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d;
        double root,root1;
        d =b*b-4*a*c;
        if(d==0)
        {
            root=root1=-b/2*a;
            System.out.printf("%.2f",root1);
        }
        else if(d>0)
        {
            root=(-b+Math.sqrt(d)/2*a);
            root1=((-b)-Math.sqrt(d)/2*a);
            System.out.printf("%2f",root);
            System.out.printf("%.2f",root1);

        }
        else
        {
            double real,imag;
            real=-b/(2*a);
            imag=Math.sqrt(Math.abs(d));
            System.out.println(real+" i+"+imag);
            System.out.println(real+" i-"+imag);


        }
    }
}
