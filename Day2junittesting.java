package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day2junittesting {

	@Test
	void test() {
		markvalidator mvtest = new markvalidator();
		temperature temptest = new temperature();
		mvtest.ispass(83);
		mvtest.markGrade(85);
		temptest.convertToCelsius(88);
		temptest.convertToFarenheit(522);
		
	}

}
