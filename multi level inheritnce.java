import java.util.*;
import javafx.scene.ParentBuilder;
class parent2
{
    int x;
    public parent2()
    {
        x=10;
    }
    public void show()
    {
        System.out.print("parent\n");
        System.out.println(x);
    }
}
class child2 extends parent2
{
    int y;
    public child2()
    {
        y=20;
    }
    public void display()
    {
        System.out.print("Child\n");
        System.out.println(y);
    }
}
class child3 extends child2
{
    int z;
    public child3()
    {
        z=99;
    }
    public void print()
    {
        System.out.print("2nd child"+z);
    }
}
class multilevel
{
    public static void main(String args[])
    {
        child3 c3=new child3();
        c3.show();
        c3.print();
        c3.display();
    }
}