/*
	Autor: Tobias Verstappen
	
	
*/
package toolbox;

public class AutopreisBerechnen 
{
	private int alter = 0;
	private double kilometerstand = 0.0;
	private int ps = 0;
	private double neupreis;
	private double preis;

	public AutopreisBerechnen(double neupreis, int alter, int ps, double kilometerstand)
	{
		this.alter = alter;
		this.kilometerstand = kilometerstand;
		this.ps = ps;
		this.neupreis = neupreis;
	}
	
	public void Berechnung()
	{
		preis = neupreis - (alter);
		
		System.out.println(preis);
	}
}
