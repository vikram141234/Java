package Module_3;

class A {
	public void m() {
		System.out.println('A');
	}
}
class B extends A {
	public void m() {
		System.out.println('B');
	}
}
public class RunTimePolymorphism {
	public static void main(String[] args) {
	    A a=new A();
	    a.m();
	    B b=new B();
	    b.m();
	    A aa=new B();
	    aa.m();

	}

}
