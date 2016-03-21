package toolbox;



public class Umwandlung 
{
	public void CelsiusInFahrenheit(double celsius)
	{
		double fahrenheit = 0;
		fahrenheit = celsius * 1.8 + 32;
		System.out.printf("%4.2f °C = %4.2f °F\n\n\n", celsius, fahrenheit);
	}
	
	public void FahrenheitInCelsius()
	{
		
	}
	
	public void GBinMB(){
		
	}
	
	public void EuroInFranken(double wert)
	{
		// Autor: Tobias Verstappen
		double euro = 0.0;
		double franken = 0.0;
		
		franken = wert / 0.9;
		System.out.printf("%4.2f € = %4.2f CHF", wert, franken);
	}
	public void MBinGB()
	{
		
	}
}
