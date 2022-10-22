import java.util.*;
class Solution10
{
    int x;
    float y;
    public Solution10()
    {
        System.out.println("ITS IS CONSTRUCTOR");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextFloat();

    }
    public void yes()
    {
        System.out.println(x+" "+y);
    }
    public static void main(String args[])
    {
        Solution10 s=new Solution10();
        s.yes();
    }
}