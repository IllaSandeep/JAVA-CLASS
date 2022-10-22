import java.util.*;
import javafx.scene.ParentBuilder;
class parent1
{
    int x;
    public parent1()
    {
        x=10;
    }
    public void show()
    {
        System.out.print("parent\n");
        System.out.println(x);
    }
}
class child1 extends parent1
{
    int y;
    public child1()
    {
        y=20;
    }
    public void display()
    {
        System.out.print("Child\n");
        System.out.println(y);
    }
}
class singlelevel
{
    public static void main(String args[])
    {
        child1 c=new child1();
        c.display();
        c.show();
    }
}