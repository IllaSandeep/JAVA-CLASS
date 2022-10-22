import java.util.*;

import javafx.scene.ParentBuilder;
class par
{
    int x;
    public par()
    {
        x=10;
    }
    public void show()
    {
        System.out.print("parent\n");
        System.out.println(x);
    }
}
class chi extends par
{
    int y;
    public chi()
    {
        y=22;
    }
    public void display()
    {
        System.out.print("Child\n");
        System.out.println(y);
    }
}
class chi2 extends par
{
    int z;
    public chi2()
    {
        z=23;
    }
    public void print()
    {
        System.out.print("Child2\n");
        System.out.println(z);
    }
}
class hierichallevel
{
    public static void main(String args[])
    {
        chi c=new chi();
        chi2 c1=new chi2();
        c.display();
        c.show();
        c1.print();
        c1.show();
    }
}