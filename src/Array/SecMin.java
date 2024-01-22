package Array;

public class SecMin {

	public static void main(String[] args) {
		float a[]= {3,0.1f,2,9,1,0.05f},min=a[0],smin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			else if(smin>min)
			{
				smin=min;
			}
		}
		System.out.println(min);
		System.out.println(smin);

	}

}
