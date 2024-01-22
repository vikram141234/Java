package Array;

public class MinNum {

	public static void main(String[] args) {
		float a[]= {3,0.1f,2,9,1,0.05f},min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
		

	}

}
