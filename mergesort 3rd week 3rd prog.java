import java.util.*;
class Merge
{
public static  void merge(int[] arr,int l,int m,int h)
{
	int i,j,n1,n2,k;
    int[] a=new int[100];
    int[] b=new int[100];
	n1=m-l+1;
	n2=h-m;
	k=l;
	for(i=0;i<n1;i++)
	{
		a[i]=arr[k++];
	}
	k=m+1;
	for(i=0;i<n2;i++)
	{
		b[i]=arr[k++];
	}
    k=l;
    i=0;
    j=0;
	while(i<n1 && j<n2)
	{
		if(a[i]<b[j])
		{
			arr[k++]=a[i++];
		}
		else{
			arr[k++]=b[j++];
		}
	}
	while(i<n1)
	{
		arr[k++]=a[i++];
	}
	while(j<n2)
	{
		arr[k++]=b[j++];
	}
}
public static void merge_sort(int[] arr,int L,int H)
{
	int M;
	if(L<H)
	{
		M=(L+H)/2;
		merge_sort(arr,L,M);
		merge_sort(arr,M+1,H);
		merge(arr,L,M,H);
	}
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        merge_sort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",a[i]);	
        }
    }
}