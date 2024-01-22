package Array;

public class DelDup {

	public static void main(String[] args) {
		int a[]= {1,1,6,2,2,3,3,4,4,5,5,6},temp;
		int b[]=new int[a.length],d=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int k=0;k<a.length-1;k++)
		{
			if(a[k]!=a[k+1])
			{
				b[d]=a[k];
				d++;
			}
		}
		b[d]=a[a.length-1];
		for(int l=0;l<b[d];l++)
		{
			System.out.println(b[l]);
		}
	}
}
