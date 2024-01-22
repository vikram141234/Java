package Module_1;

public class Palindrome {

	public static void main(String[] args) {
		int i=121 ,rem,rev=0,temp=i;
		while(i>0)
		{
			rem=i%10;
			i=i/10;
			rev=rev*10+rem;
		}
		if(rev==temp)
			System.out.println(rev);
			
		

	}

}
