package Module_3;
class Gvc {
	public void name(String name) 
	{
		System.out.println("Name="+name);
	}
}
class Nani extends Gvc {
	public void name(String name,int age)
	{
		System.out.println("Name="+name+"\nAge="+age);
	}
}
class Vicky extends Nani {
	public void name (String name,int age,float height)
	{
		System.out.println("Name="+name+"\nAge="+age+"\nHeight="+height);
	}
}
public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Vicky v=new Vicky();
		v.name("Vikram",25,5.9f);
		
	}

}
