package Array;

public class SecondMinAndMax {

	public static void main(String[] args) {
		int a[]= {1,2,3,10,4,8,9,5,6},temp;
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
//		System.out.println("Min="+a[0]);
//		System.out.println("Max="+a[a.length-1]);
//		System.out.println("Sec Min="+a[1]);
//		System.out.println("Sec Max="+a[a.length-1-(a.length-1)]);
		
		System.out.println("Max="+a[a.length-1]);
		System.out.println("Min="+a[a.length-a.length]);
		System.out.println("Sec Min="+a[1]);
		System.out.println("Sec Max="+a[a.length-2]);
		
	}

}
