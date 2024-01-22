package Module_2;

public class ThisKeywordConstructor {
	int a,b,c;
	public ThisKeywordConstructor(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public static void main(String[] args) {
		ThisKeywordConstructor c=new ThisKeywordConstructor(8,9,10);
		System.out.println(c.a+"\n"+c.b+"\n"+c.c);

	}

}
