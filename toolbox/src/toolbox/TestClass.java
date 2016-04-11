/*
 *  doku by:	Janosh Björkman (TRUE PRO MLG JAVA-DEVELOPER) <- no scam
 * 
 *	project:	toolbox
 * 
 * 	usage:		(see comments in source-code)
 * 
 */

package toolbox;

public class TestClass {
	
	//	Im main werden alle Berechnungen und Umwandlungen initialisiert
	//	ERKLÄRUNG:
	//		UMWANDLUNG:
	//			1. Erstellen Sie als erstes eine Instanz der Klasse Umwandlung
	//			2. Rufen Sie mit der oben erstellten Instanz den gewünschten Vorgang auf (Parameter nicht vergessen).
	//	
	//		BERECHNUNG:
	//			1. Erstelle Sie als erstes eine Instanz der Klasse Berechnungen
	//			2. Rufen Sie mit der oben erstellten Instanz den gewünschten Vorgang auf (Parameter nicht vergessen).
	
	public static void main(String[] args) 
	{
		// 
		Umwandlung Umwandlung = new Umwandlung();
		Umwandlung.CelsiusInFahrenheit(32);
		Umwandlung.CelsiusInFahrenheit(10);
		
		System.out.println("Hier wird getestet, wie viele Franken die Angegebenen Euro sind. \nTest Werte: 12€ == 13.33CHF.");
		Umwandlung Waehrung = new Umwandlung();
		Waehrung.EuroInFranken(12.0);
		
		Umwandlung mbtogb = new Umwandlung();
		mbtogb.MBinGB(690);
		
		Umwandlung gbtomb = new Umwandlung();
		gbtomb.GBinMB(125.3);
		
		AutopreisBerechnen auto = new AutopreisBerechnen(8000.0, 3, 333, 4000.0);
		auto.Berechnung();

		Berechnungen zufallszahl1= new Berechnungen();
		zufallszahl1.Zufallszahl(15000, 0);	
		
		Berechnungen Berechnungen = new Berechnungen();
		Berechnungen.Zufallszahl(15000, 0);
		Berechnungen.Zufallszahl(15000, 0);
		
		Berechnungen.SinusCosinusTangens("Sinus", "Grad", 90);
		
		Berechnungen.SinusCosinusTangens("Sinus", "Rad", 90);
		
<<<<<<< HEAD
<<<<<<< HEAD
		Berechnungen.SinusCosinusTangens("Cosinus", "Grad", 90);
=======
		Berechnungen.Tangens(32);
		
		Berechnungen phWert = new Berechnungen();
		phWert.phWert(0.2);
>>>>>>> origin/master
=======

		Berechnungen.SinusCosinusTangens("Cosinus", "Grad", 90);

		
		Berechnungen phWert = new Berechnungen();
		phWert.phWert(0.2);
>>>>>>> f7859e04bdcb86ce7aa1639042abaf017a1e4541
	}
}
