package day3;

public class switchcase {
	void ispass( int mark){
		System.out.println("The given marks are ");
		System.out.println(mark);
		if ( mark >= 40) {
			System.out.println("Student is pass");}
		else 
		{
			System.out.println("Student is fail");}
		}
	void markGrade(int mark) {
		System.out.println("The given marks are ");
		System.out.println(mark);
		int a;
		if(mark >= 90) {
			a=0;
			}
		else if (mark >= 75 && mark <90 ) {
			a=1;
			}
		else if (mark >= 60 && mark < 75) {
			a=2;
			}
		else {
			a=3;
			}
		switch (a) {
		case 0:
		{
			System.out.println("Student got grade A");
		}
		case 1:
		{
			System.out.println("Student got grade B");
		}
		case 2:
		{
			System.out.println("Student got grade C");
		}
		case 3:
		{
			System.out.println("Student got grade D");
		}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchcase sc =new switchcase();
		sc.ispass(45);
		sc.markGrade(45);
		

	}

}
