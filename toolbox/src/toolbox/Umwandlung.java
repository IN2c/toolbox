package toolbox;

public class Umwandlung 
{
	public void CelsiusInFahrenheit(double celsius)
	{
		//Autor: Oliver F�llemann
		double fahrenheit = 0;
		fahrenheit = celsius * 1.8 + 32;
		System.out.printf("%4.2f �C = %4.2f �F\n\n\n", celsius, fahrenheit);
	}
	
	public void FahrenheitInCelsius(double fahrenheit)
	{
		//Autor: Oliver F�llemann
		double celsius = 0;
		celsius = (fahrenheit-32)/1.8;
		System.out.printf("%4.2f �F = %4.2f �C\n\n\n", fahrenheit, celsius);
	}
	
	public void GBinMB(){
		
	}
	
	public void EuroInFranken(double wert)
	{
		// Autor: Tobias Verstappen
		double euro = 0.0;
		double franken = 0.0;
		
		franken = wert / 0.9;
		System.out.printf("%4.2f � = %4.2f CHF \n", wert, franken);
	}
	
	public void MBinGB(double wert)
	{
		// Autor: Janosh Bj�rkman
		double gb = wert/1024;
		System.out.printf("%4.2f MB entsprechen %4.2f GB\n\n\n", wert, gb);
	}
}
