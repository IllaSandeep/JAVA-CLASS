import java.util.*;
class box
{
    int l,b,h,area,vol;
    public box()
    {
        l=1;
        b=1;
        h=1;
    }
    public box(int p)
    {
        l=p;
        b=p;
        h=p;
    }
    public box(int p,int q,int r)
    {
        l=p;
        b=q;
        h=r;
    }
    public void showdet()
    {
        System.out.println("L="+l+" b ="+b+"h ="+h);
    }
    public int getArea()
    {
        return l*b;
    }
    public int getvol()
    {
        return l*b*h;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int o=sc.nextInt();
        box s=new box();
        box s1=new box(m);
        box s2=new box(m,n,o);
        System.out.println(s.getArea());
        System.out.println(s.getvol());
        System.out.println(s1.getArea());
        System.out.println(s1.getvol());
        System.out.println(s2.getArea());
        System.out.println(s2.getvol());
    }
}