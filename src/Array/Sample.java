package Array;

public class Sample {

	public static void main(String[] args) {
		
		int [] a = {40 , 30 ,20, 10, 30 ,20 ,10 , 50 , 60 ,70};
		{
			for(int i = 0 ; i<=a.length-1 ; i++)
			{
				int count = 0;
				for(int j=0 ; j<=a.length-1 ; j++)
				{
					if(a[i]==a[j]&&a[i]>a[j])
					{
						break;
					}
					
					if(a[i]==a[j])
					{
						count++;
					}
				}
				if(count>1)
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
