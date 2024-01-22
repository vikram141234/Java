package String;

public class Split {

	public static void main(String[] args) {
		String str="we are test engineers";
		String s[]=str.split(" ");
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.println(s[i]);
		}
		
		String str1="Java Testers In Qspiders";
		String s1[]=str1.split(" ");
		for(int j=s1.length-1;j>=0;j--)
		{
			System.out.println(s1[j]);
		}

	}

}
