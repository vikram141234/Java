package String;

public class NoOfOccuranceG {

	public static void main(String[] args) {
		String s="gvcg";
		int count=0,countt=0;
		for( int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='g')                        
		                                   // if(ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f'||ch=='g'||ch=='h'||ch=='i'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='o'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='u'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z')
				count++;
		}
          System.out.println(count);
	}

}
