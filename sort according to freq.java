import java.util.*;
import java.util.Map.*;
class Sosasdsdvsd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		String s="sandeep";
		char[] arr=s.toCharArray();
		int n=arr.length;
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			hm.put(arr[i],c);
		}
		System.out.println(hm);
		List<Entry<Character,Integer>> l=new ArrayList<>(hm.entrySet());
		Collections.sort(l,new Comparator<Entry<Character,Integer>>(){
			public int compare(Entry<Character,Integer> i1,Entry<Character,Integer> i2)
			{
				return i2.getValue().compareTo(i1.getValue());
			}
		});
		String s22="";
		System.out.println(l);
            for(Entry<Character,Integer> e:l)
                 s22+=e.getKey();
		System.out.println(s22);


    }
}