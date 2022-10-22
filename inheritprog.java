import java.util.*;
class decimal
{
    int x;
    Scanner sc=new Scanner(System.in);
    public void readx()
    {
        x=sc.nextInt();
        sc.close();
    }
    public void showx()
    {
        System.out.println("decimal: "+x);
        
    }
}
class octal extends decimal
{
    public void dis()
    {
        System.out.println("Octal: "+Integer.toOctalString(x));
    }
}
class hexadec extends decimal
{
    public void disp()
    {
        System.out.println("Hexadecimal: "+Integer.toHexString(x));
    }
}
class inhetprog
{
    public static void main(String args[])
    {
        octal o=new octal();
        o.readx();
        o.showx();
        o.dis();
        hexadec hd=new hexadec();
        hd.disp();
    }
}