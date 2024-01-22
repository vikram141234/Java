package Febinocci;

public class FebinocciPractice {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println("After Swapping="+a);
		System.out.println("After Swapping="+b);
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("After Swapping="+c);
			
		}
		
		

	}

}
