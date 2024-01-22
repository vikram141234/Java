package Module_2;

class Areas{
	public float tri(int b,int h)
	{
		float areaOfTri=0.5f*b*h;
//		System.out.println(areaOfTri);
		return areaOfTri;
	}
	public int rect(int l,int b)
	{
		int areaOfRect=l*b;
//		System.out.println(areaOfRect);
		return areaOfRect;
	}
}
public class MethodWithArgs {

	public static void main(String[] args) {
		Areas a=new Areas();
		float triangle=a.tri(9,3);
		int rectangle = a.rect(3, 8);
		System.out.println(triangle);
		System.out.println(rectangle);

	}

}
