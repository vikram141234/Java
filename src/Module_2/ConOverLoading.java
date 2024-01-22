package Module_2;

class OverLoadingg{
	String name;int age;float height;
	public OverLoadingg(String Pname) 
	{
		name=Pname;
	}
	public OverLoadingg(String Pname,int Page)
	{
		name=Pname;
		age=Page;
	}
	public OverLoadingg(String Pname,int Page,float Pheight)
	{
		name=Pname;
		age=Page;
		height=Pheight;
	}
}
public class ConOverLoading {
	public static void main(String[] args) {
		OverLoadingg Co=new OverLoadingg("Gvc",25,5.9f);
		System.out.println(Co.name+"\n"+Co.age+"\n"+Co.height);

	}

}
