package UpCastingANdDownCasting;

    class abc
    {
    	public void a() {
    		System.out.println("a");
    }}
    class def
    {
    	public void bbb() {
    		System.out.println("b");
    }}
public class UpCasting {
	public static void main(String[] args) {
		def a=new def();
		a.bbb();

	}

}
