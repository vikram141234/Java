package String;

public class WordLength {

	public static void main(String[] args) {
		String s="we are test enggg";
		String str[]=s.split(" ");
		String max=str[0];
		for(String word:str)
		{
			if(word.length()>max.length())
			{
				max=word;
			}
		}
		System.out.println(max);
		

	}

}
