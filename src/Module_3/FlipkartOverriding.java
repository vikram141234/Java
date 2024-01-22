package Module_3;

class Apple {
	public void price()
	{
		System.out.println(140000);
	}
}
class Samsung extends Apple {
	public void price() 
	{
		System.out.println(96000);
	}
}
class OnePlus extends Samsung {
	public void price()
	{
		System.out.println(56000);
	}
}
class Infinix extends OnePlus {
	public void price() {
		System.out.println(20000);
	}
}
public class FlipkartOverriding {
	public static void main(String[] args) {
		Infinix i=new Infinix();
		i.price();
		OnePlus o=new OnePlus();
		o.price();
		Samsung s=new Samsung();
		s.price();
		Apple a=new Apple();
		a.price();

	}

}
