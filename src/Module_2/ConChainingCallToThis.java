package Module_2;

public class ConChainingCallToThis {
	public ConChainingCallToThis(int age) 
	{
		this("Gvc");
		System.out.println(age);
	}
	public ConChainingCallToThis(String name)
	{
		this(5.9f);
		System.out.println(name);
		
	}
	public ConChainingCallToThis(float height)
	{
		System.out.println(height);
	}
	public ConChainingCallToThis()
	{
		this(25);
		System.out.println("No args");
	}
	
	public static void main(String[] args) {
		ConChainingCallToThis c=new ConChainingCallToThis();
		

	}

}
