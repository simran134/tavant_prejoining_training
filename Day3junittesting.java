package day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day3junittesting {

	@Test
	void test() {
		switchcase swtest = new switchcase();
		sumofnumbers sonostest = new sumofnumbers();
		factorial facttest = new factorial();
		swtest.ispass(22);
		swtest.markGrade(56);
		sonostest.sumOfEvenNumbers(10, 20);
		sonostest.sumOfOddNumbers(10, 20);;
		facttest.calculateFactorial(8);
	}

}
