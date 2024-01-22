package Array;

public class LargestNumFindingArray {

	public static void main(String[] args) {
		int a[]= {1,3,5,9,7,4},temp;
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
//		for(int k=0;k<a.length-1;k++)
//			System.out.println(a[k]);
		System.out.println("Max="+a[a.length-1]);
		System.out.println("2nd Max="+a[a.length-2]);
		System.out.println("Min="+a[0]);
		System.out.println("2nd Min="+a[1]);

	}

}		
