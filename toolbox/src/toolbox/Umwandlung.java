package toolbox;



public class Umwandlung 
{
	public void CelsiusInFahrenheit(double celsius)
	{
		double fahrenheit = 0;
		fahrenheit = celsius * 1.8 + 32;
		System.out.printf("%4.2f Grad Celsius entsprechen in Fahrenheit: %4.2f\n\n\n", celsius, fahrenheit);
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
		System.out.printf("%4.2f", franken);
	}
	
	public void MBinGB(double wert)
	{
		// Autor: Janosh Björkman
		double gb = wert/1024;
		System.out.printf("%4.2f MB entsprechen %4.2f GB\n\n\n", wert, gb);
	}
}
