package week5.day5;

public class Students {
	public void getStudentinfo(int stuId) {
		System.out.println("student Id "+stuId);
		}
   public void getStudentinfo(int stuId,String stuName) {
	   System.out.println("student Id"+stuId+"student Name"+stuName );
	  
  }
   public void getStudentinfo(String stuMailId,long stuMobNumber ) {
	   System.out.println("student MailId is"+stuMailId +"student mobile number"+ stuMobNumber);
   }
   public static void main(String[] args) {
	Students Stu=new Students();
    Stu.getStudentinfo(654);
	Stu.getStudentinfo(67854 ,"hema");
	Stu.getStudentinfo("sreehema@gmail.com", 123456789l);
	}

}
