package Module_3;

class Ghi {
	public void abc() {
		System.out.println("ghi");
	}
}
class Jkl extends Ghi {
	public void def() {
		System.out.println("jkl");
	}
}

public class DownCasting {
	public static void main(String[] args) {
		Ghi g=new Jkl();
		Jkl j=(Jkl)g;
		j.abc();
		j.def();

	}

}
