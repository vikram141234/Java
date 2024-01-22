package String;

public class FrequencyOfWord {

	public static void main(String[] args) {
		String s="java is one of the programming language of devloping";
		String st[]=s.split(" ");
		int count=0;
		for(String word:st)
		{
			
			if(word.equalsIgnoreCase("of"))
			{
				count++;
			}
		}
		System.out.println(count);
	}			
}
