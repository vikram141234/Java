package Module_3;

class Sup {
	Sup(String name)
	{
		System.out.println("Name="+name);
	}
}

class Super extends Sup {
	Super(int age)
	{
		super("Gvc");
		System.out.println("Age="+age);
	}
}

class CallTo extends Super {
	CallTo(float height)
	{
		super(25);
		System.out.println("Height="+height);
	}
}

class CallToSuperr extends CallTo {
	CallToSuperr()
	{
		super(5.9f);
		System.out.println("No Args VIKRAM");
	}
}
public class CallToSuper {

	public static void main(String[] args) {
		CallToSuperr s=new CallToSuperr();

	}

}
