import java.util.*;
class rolex
{
    int drugs;
    public rolex(int p)
    {
        drugs=p;
    }
    public void show()
    {
        System.out.println("rolex drugs quantity "+drugs+" TONS");
    }
}
class santhanam extends rolex
{
    int drugs;
    public santhanam(int p,int q)
    {
        super(p);
        drugs=q;
    }
    public void show()
    {
        super.show();
        System.out.println("Santhanam drugs quantity "+drugs+" TONS");
    }
}
class amar extends santhanam
{
    int drugs;
    public amar(int p,int q,int r)
    {
        super(p,q);
        drugs=r;
    }
    public void show()
    {
        super.show();
        System.out.println("Amar Drugs quantity "+drugs+" TONS");
    }
}
class Red
{
    public static void main(String args[])
    {
        amar amm=new amar(100, 40, 22);
        amm.show();
    }
}
