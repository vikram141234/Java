package Module_2;

class Areass{
	public void tri() {
		int b=5,h=3;
		float areaOfTri=0.5f*b*h;
		System.out.println(areaOfTri);
	}
	public void rect() {
		int areaOfRect,l=10,b=6;
		areaOfRect=l*b;
		System.out.println(areaOfRect);
	}
}

public class MethodWithOutArgs {

	public static void main(String[] args) {
		Areass a=new Areass();
		a.tri();
		a.rect();

	}

}
