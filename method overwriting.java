class prnt
{
    int x=30;
    public void ex()
    {
        System.out.println(x);
    }
}
class chld1 extends prnt 
{
    int y=100;
    public void ex()
    {
        System.out.println(y);
    }
}
class res
{
    public static void main(String args[])
    {
        chld1 p1=new chld1();
        p1.ex();
    }
}
