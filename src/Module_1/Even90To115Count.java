package Module_1;

public class Even90To115Count {

	public static void main(String[] args) {
		int count=0;
		for(int i=90;i<=115;i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.println(i+"-->"+count);
			}
		}
		

	}

}
