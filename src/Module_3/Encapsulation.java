package Module_3;

class Encap {
	String name;
	int age;
	float height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}	
}

public class Encapsulation {
	public static void main(String[] args) {
		Encap e=new Encap();
		e.setName("Gvc");
		System.out.println(e.getName());
		e.setAge(25);
		System.out.println(e.getAge());
		e.setHeight(5.9f);
		System.out.println(e.getHeight());
		

	}

}
