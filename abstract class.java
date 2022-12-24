import java.util.*;
abstract class Shape
{
    Scanner sc=new Scanner(System.in);
    int a;
    float area;
    public abstract void getInput();
    public abstract void calArea();
    public void showArea()
    {
        System.out.println(area);
    }
}
class Rectangle extends Shape
{
    int b;
    public void getInput()
    {
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public void calArea()
    {
        area=a*b;
    }
}
class Circle extends Shape
{
    final float pi=3.14;
    public void getInput()
    {
        a=sc.nextInt();
    }
    public void calArea()
    {
        area=pi*a*a;
    }
}
class abscls
{
    public static void main(String args[])
    {
        Shape s;
        s=new Rectangle();
        s.getInput();
        s.calArea();
        s.showArea();
        Shape s1;
        s1=new Circle();
        s1.getInput();
        s1.calArea();
        s1.showArea();
    }
}