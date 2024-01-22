package EncapsulationPractice;
class gvc {
   private String name;
   
public String getName() {
	if(name=="Vicky")
	{
		return name;
	}
	else
	{
		return "Invalid";
	}
	
	
}
public void setName(String name) {
	this.name = name;
}
}
public class Students {
	public static void main(String[] args) {
		gvc g=new gvc();
		g.setName("Vicky");
		String name=g.getName();
		System.out.println(name);

	}

}
