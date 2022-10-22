import java.util.*;
class coder
{
    int x;
    char ch;
    public void setx(int n)
    {
      x=n;
    }
    public void setch(char c)
    {
      ch=c;
    }
    public int getx()
    {
      return x;
    }
    public char getch()
    {
      return ch;
    }
    public static void main(String args[])
    {
        coder s=new coder();
        s.setx(10); 
        System.out.println(s.getx());
        
    }
}