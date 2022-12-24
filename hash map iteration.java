import java.security.spec.EncodedKeySpec;
import java.util.Map.*;
import java.util.*;
class DEMO
{
    public static void main(String args[])
    {
       int[] a={1,1,3,4};
       HashMap<Integer,Integer> hm=new HashMap<>();
       int n=a.length;
       int k=2;
       for(int i=0;i<n;i++)
       {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            hm.put(a[i], c);
       }
       System.out.println(hm);
       if(hm.containsValue(k))
       {
            for(Map.Entry<Integer,Integer> m: hm.entrySet())
            {
                if((int)m.getValue()==k)
                {
                    System.out.println(m.getKey());
                }
            }
       }
    }
}