package controller;

public class AutoPreisBerechnen 
{
	private int alter = 0;
	private double kilometerstand = 0.0;
	private int ps = 0;
	private double neupreis;
	private double preis;

	public AutoPreisBerechnen(double neupreis, int alter, int ps, double kilometerstand)
	{
		this.alter = alter;
		this.kilometerstand = kilometerstand;
		this.ps = ps;
		this.neupreis = neupreis;
	}
	
	public void Berechnung()
	{
		if(alter <= 3)
		{
			preis = neupreis - (neupreis / 3);
			if(ps < 100)
			{
				preis -= 100;
			}
			else
			{
				preis -= 200;
			}
		}
		else
		{	
			preis = neupreis - (neupreis / 4);
			preis = preis - (neupreis / alter);
			if(ps < 100)
			{
				preis -= 100;
			}
			else
			{
				preis -= 200;
			}
		}
		
		System.out.printf("\nDer geschätze Autowert beträgt: %4.2f Franken \n\n\n", preis);
	}
}
