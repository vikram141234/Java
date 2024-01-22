package String;

public class RemoveDupChar {

	public static void main(String[] args) {
		String d="mama";
		String dup="";
		for(int i=0;i<d.length();i++)
		{
			char ch=d.charAt(i);
			if(dup.indexOf(ch)==-1)
			dup=dup+ch;
		}
		System.out.println(dup);

	}

}
