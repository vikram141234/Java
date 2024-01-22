package String;

import java.util.Set;
import java.util.LinkedHashSet;

public class DelDupWords {

	public static void main(String[] args) {
		String s="java java";
		String st[]=s.split(" ");
		Set<String> d=new LinkedHashSet();
		for(int i=0;i<st.length;i++)
		{
			d.add(st[i]);
		}
		for(String word:d)
		{
			System.out.println(word);
		}
	}

}
