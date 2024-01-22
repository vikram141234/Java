package String;

import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromAstring {

	public static void main(String[] args) {
		String s="aaa bbb ccc ccc ddd ddd";
		String str[]=s.split(" ");
		Set<String> aftrremov=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			aftrremov.add(str[i]);
		}
		for(String word:aftrremov)
		{
			System.out.print(word+" ");
		}
		
	

	}

}
