import java.util.*;

import javax.xml.transform.stax.StAXResult;
class asldjgbkaj
{
    public static boolean bal(String s)
    {
        Deque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
            {
                st.push(c);
            }
            else{
                if(st.isEmpty())
                {
                    return false;
                }
                if(c==']' && st.peek()!='[')
                {
                    return false;
                }
                if(c==')' && st.peek()!='(')
                {
                    return false;
                }
                if(c=='}' && st.peek()!='{')
                {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(bal(s))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }

    }
}