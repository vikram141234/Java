package Module_1;

public class Palindrome1 {

	public static void main(String[] args) {
         int num=12321,rem,rev=0,temp=num;
         while(num>0)
         {
        	 rem=num%10;
        	 num=num/10;
        	 rev=rev*10+rem;
         }
         if(temp==rev)
         {
        	 System.out.println(rev);
         }
         else
         {
        	 System.out.println("Not Palindrome");
         }

	}

}
