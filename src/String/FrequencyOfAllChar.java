package String;

public class FrequencyOfAllChar {

	public static void main(String[] args) {
		String a="java";
		char chr[]=a.toCharArray();
		for(char ch='a';ch<'z';ch++)
		{
			int count=0;
			for(char i:chr)
			{
				if(i==1)
				{
					count++;
				}
			}
		
			if(count>0)
			System.out.println(chr);	
	     }
		//System.out.println(chr);

	}

}
