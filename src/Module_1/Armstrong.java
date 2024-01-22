package Module_1;

public class Armstrong {

	public static void main(String[] args) {
		Armstrong a=new Armstrong();
	    a.armStrong();
	    a.armStrongPractice();
	}
		public void armStrong()
		{
			int i=153,rem,arm=0,temp=i;
			while(i>0)
			{
				rem=i%10;
				i=i/10;
				arm=arm+rem*rem*rem;
			}
			if(arm==temp)
			{
				System.out.println(arm);
			}
			else
			{
				System.out.println("Not ArmStrong");
			}
		}
		
		public void armStrongPractice()
		{
			for(int i=1;i<=1000;i++)
			{
				int num=i,rem,arm=0,temp=i;
				while(num>0)
				{
					rem=num%10;
					num=num/10;
					arm=arm+rem*rem*rem;
				}
				if(arm==temp)
				{
					System.out.println("----->ArmStrong num="+arm);
				}
//				else
//				{
//					System.out.println("Not ArmStrong num"+i);
//				}	
			}
		}
		
		

}
