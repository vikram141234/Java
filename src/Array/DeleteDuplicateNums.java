package Array;

public class DeleteDuplicateNums {

	public static void main(String[] args) {
		int a[]= {1,0,3,2,3,4,5,5},temp;
		int b[]=new int[a.length],c=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]!=a[j+1])
			{
				b[c]=a[j];
				c++;
			}
			b[c]=a[a.length-1];
		}
		for(int k=0;k<=b[c];k++)
		{
			System.out.println(b[k]);
		}
	}
	
}
