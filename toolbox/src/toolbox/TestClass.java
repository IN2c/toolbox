/*
 *  doku by:	Lars der kleine Eisbär
 * 
 *	project:	toolbox
 * 
 * 	usage:		(see comments in source-code)
 * 
 */

package toolbox;

import java.io.IOException;
import java.util.Scanner;

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
	
	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(System.in);
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
		

		Berechnungen.SinusCosinusTangens("Cosinus", "Grad", 90);
		
		Berechnungen hypothenuse = new Berechnungen();
		hypothenuse.hypothenuse(15, 8);
		Berechnungen ankathete = new Berechnungen();
		ankathete.ankathete(8, 30);
		Berechnungen gegenkathete = new Berechnungen();
		gegenkathete.gegenkathete(15, 30);
		
		Berechnungen phWert = new Berechnungen();
		phWert.phWert(0.2);

		Berechnungen.SinusCosinusTangens("Cosinus", "Grad", 90);

		Berechnungen mittelwert = new Berechnungen();
		mittelwert.mittelwertRechnung(33);
	}
}
