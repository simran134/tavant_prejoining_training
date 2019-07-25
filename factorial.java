package day3;

public class factorial {
	void calculateFactorial(int number) {
		int i;
		int fact=1;
		for(i=1; i<=number; i++) {
				fact = fact*i;
				}
		System.out.println(" factorial is :");
        System.out.println(fact);
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f =new factorial();
		f.calculateFactorial(5);
		
	}

}
