package controller;

public class EuroInFranken 
{
	public void EuroInFranken(double wert)
	{
		// Autor: Tobias Verstappen
		double euro = 0.0;
		double franken = 0.0;
		
		franken = wert / 0.9;
		System.out.printf("%4.2f � = %4.2f CHF \n", wert, franken);
	}
}
