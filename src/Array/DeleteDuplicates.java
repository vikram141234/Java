package Array;

public class DeleteDuplicates {

	public static void main(String[] args) {
	    int a[]= {1,1,2,3,3,2},temp=0,d=0;
		int b[]=new int[a.length];
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
		//	System.out.println(a[i]);
		}
		for(int k=0;k<a.length-1;k++)
		{
			if(a[k]!=a[k+1])
			{
				b[d]=a[k];
				d++;
			}
			b[d]=a[a.length-1];
		}
		for(int l=0;l<=d/* it is also fine b[d]*/;l++)
		{
			System.out.println(b[l]);
		}
		
		
	    }
	    
	}

/*
int a[]= {1,10,2,2,3,3,4,4,5,5},temp=0;
int b[]=new int[a.length],d=0;
for(int i=0;i<=a.length-1;i++)
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
//	System.out.println(a[i]);
}
for(int i=0;i<a.length-1;i++)
{
	if(a[i]!=a[i+1])
	{
		b[d]=a[i];
		d++;
	}}
		b[d]=a[a.length-1];
	
	for(int j=0;j<=d;j++)
		System.out.println(b[j]);

*/