package Module_3;

class Abc {
	public void abc() {
		System.out.println("abc");
	}
}
class Def extends Abc {
	public void def() {
		System.out.println("def");
	}
}

public class Upcasting {
	public static void main(String[] args) {
		Def d=new Def();
		d.abc();
		d.def();
		

	}

}
