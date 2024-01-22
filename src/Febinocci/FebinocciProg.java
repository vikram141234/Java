package Febinocci;

import java.util.Scanner;

public class FebinocciProg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many series you want");
		int n=s.nextInt();
		int a=0,b=1,c;
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
