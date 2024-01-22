package Module_1;
import java.util.*;
public class SwapingWithExtraVar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b");
		int a=s.nextInt(),b=s.nextInt(),c;
		System.out.println("a="+a+"\nb="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+"\nb="+b);

	}

}
