package com.bridgelabz.jUnitTesting;

public class TemperatureConversion {
	public static double temperatureConversion(int temp, char mode)
	{
		switch(mode)
		{
		case 'f': double fahrenheit = (temp * 9/5)+32;
		return fahrenheit;
		case 'c': double celsius = (temp - 32)*(9/5);
		return celsius;
		}
		return 0.0;
	}

}
