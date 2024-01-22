package EncapsulationPractice;

class student {
   private String studentname;
   private int age;
   private int rollno;
      
     public void setstudentname(String studentname) {
    	 this.studentname=studentname;
     }
     public String getstudentname() {
    	 if(studentname=="Vicky")
    	     return "valid";
    	 else
    		 return "invalid";
    		 
     }
     public void setage(int age) {
    	 this.age=age;
     }
     public int getage() {
    	 if(age==25)
    	     return 25;
    	 else
    		 return 0;
    	 
     }
     public void setrollno(int rollno) {
    	 this.rollno=rollno;
     }
     public int getrollno() {
    	 if(rollno==1412)
    	     return 1412;
    	 else
    		 return 1289;
    	 
     }
}
    public class FirstStudentTeacher {
	public static void main(String[] args) {
		student s=new student();
		s.setstudentname("Vicky");
		String name=s.getstudentname();
		System.out.println(name);
		s.setage(25);
		int age=s.getage();
		System.out.println(age);
		s.setrollno(1412);
		int rollno=s.getrollno();
		System.out.println(rollno);
		

	}

}
