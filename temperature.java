package day2;

public class temperature {
	
	void convertToFarenheit( double c)
	{ 
		double Farenheit_value;
		Farenheit_value = ((c*9)/5) + 32;
		System.out.println("farenheit value is ");
		System.out.println(Farenheit_value);
	
	}
	void convertToCelsius (double f)
	{
		double Celsius_value;
		Celsius_value = ((f-32)*5)/9;
		System.out.println("celsius value is ");
		System.out.println(Celsius_value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		temperature temp = new temperature();
		temp.convertToFarenheit(30);
		temp.convertToCelsius(112);
		
		
		
	}

}
