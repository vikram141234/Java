package String;

public class FindCountOfGinGivenString {

	public static void main(String[] args) {
		String s="gungostgirlgoal";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch=='g')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
