package Swaping;

import java.util.Scanner;

public class ScannerAandB {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("a value is="+a+" "+"b value is="+b);


	}

}
