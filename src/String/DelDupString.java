package String;

import java.util.Set;
import java.util.LinkedHashSet;
public class DelDupString {

	public static void main(String[] args) {
		String s="we we we are are";
		String st[]=s.split(" ");
		Set<String>d=new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			d.add(st[i]);
		}
		for(String word:d)
		{
			System.out.print(word+" ");
		}
	}

}
