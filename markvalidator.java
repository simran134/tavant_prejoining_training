package day2;

public class markvalidator {
	
		void ispass( int mark){
			System.out.println("The given marks are ");
			System.out.println(mark);
			if ( mark >= 40) {
				System.out.println("Student is pass");
			}
			else 
			{
				System.out.println("Student is fail");
		
	    }}
		void markGrade(int mark) {
			System.out.println("The given marks are ");
			System.out.println(mark);
			if(mark >= 90) {
				System.out.println("Student got grade A");
			}
			else if (mark >= 75 && mark <90 )
			{
				System.out.println("Student got grade B");
			}
			else if (mark >= 60 && mark < 75)
			{
				System.out.println("Student got grade C");
			}
			else 
			{
				System.out.println("Student got grade D");
			}
				
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		markvalidator MV = new markvalidator();
		MV.ispass(45);
		MV.markGrade(45);
		MV.ispass(20);
		MV.markGrade(20);
		
	}

}
