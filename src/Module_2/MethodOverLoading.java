package Module_2;

class OverLoading{
	public String mobile(String Name) 
	{
		System.out.println(Name);
		return Name="Infinix";
	}
	public String mobile(String Name,int Price)
	{
//		Name="Infinix";Price=18500;
		System.out.println(Name+"\n"+Price);
		return Name+"\n"+Price;
	}
	public String mobile(String Storage,String Ram)
	{
//		Storage="128gb";Ram="8Gb";
		System.out.println(Storage+"\n"+Ram);
		return Storage+"\n"+Ram ;
	}
}
public class MethodOverLoading {
	public static void main(String[] args) {
		OverLoading ol=new OverLoading();
		ol.mobile("128Gb","8Gb");
		

	}

}
