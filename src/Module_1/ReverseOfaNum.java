package Module_1;

public class ReverseOfaNum {

	public static void main(String[] args) {
		int i=123,rem,rev=0;
		while(i>0)
		{
			rem=i%10;
			i=i/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);

	}

}
