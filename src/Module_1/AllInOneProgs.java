package Module_1;
import java.util.*;
public class AllInOneProgs {

	public static void main(String[] args) {
		AllInOneProgs a=new AllInOneProgs();
		a.factorial();
		a.product();
		a.swapWithExtraVar();
		a.swapWithoutExtraVar();
		a.armstrong();
		a.reverseNum();
		a.palindrome();
		a.primeNum();
		a.multiTable();
		
	}
	public void factorial()
	{
		int fact=1;
		for(int i=10;i>=0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public void product()
	{
		int fact=1;
		for(int i=1;i<=10;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public void swapWithExtraVar()
	{
		int a=1,b=2,c;
		System.out.println("Before swapping a="+a+" b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping a="+a+" b="+b);
	}
	public void swapWithoutExtraVar()
	{
		int a=1,b=2;
		System.out.println("Before swapping a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a+" b="+b);
	}
	public void armstrong()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Num To check Armstrong Or Not");
		int num=s.nextInt(),rem,arm=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		if(arm==temp)
		{
			System.out.println(arm+" is Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
	public void reverseNum()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Num To Reverse");
		int num=s.nextInt(),rem,rev=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}
	public void palindrome()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Num To Check Palindrome Or Not");
		int num=s.nextInt(),rem,rev=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(rev==temp)
			System.out.println(rev+" is Palindrome Num");
		else
			System.out.println("Not Palindrome Num");
	}
	public void primeNum() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range of Prime Numbers u want");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for(int j=2;j<=num;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==1)
				System.out.println(i+" is a Prime Number");
		}
	}
	public void multiTable()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Num.of.Tables u Want");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
