package day3;

public class sumofnumbers {
	void sumOfEvenNumbers(int start , int end)
	{ int sum = 0 ;
		for (int i = start;i<= end; i ++)
		{
			if (i%2==0) {
			sum = sum + i;}
		}
		System.out.println("Sum of even numbers is ");
		System.out.println(sum);
		
	}
	void sumOfOddNumbers(int start , int end)
	{ int sum = 0 ;
		for (int i = start;i<= end; i ++)
		{
			if (i%2!=0) {
			sum = sum + i;		
		}
		}
		System.out.println("Sum of odd numbers is ");
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumofnumbers sumnos =new sumofnumbers();
		sumnos.sumOfEvenNumbers(1, 10);
		sumnos.sumOfOddNumbers(1, 10);
	}

}
