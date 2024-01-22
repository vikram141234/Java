package Module_2;

public class WithOutThisConstructor {
	String name;int age;
	public WithOutThisConstructor(String Pname,int Page)
	{
		name=Pname;
		age=Page;
	}

	public static void main(String[] args) {
		WithOutThisConstructor w=new WithOutThisConstructor("Gvc",25);
		System.out.println(w.name);
		System.out.println(w.age);

	}

}
