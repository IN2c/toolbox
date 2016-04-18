/*
 *  doku by:	Lars der kleine Eisb�r
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
	//	ERKL�RUNG:
	//		UMWANDLUNG:
	//			1. Erstellen Sie als erstes eine Instanz der Klasse Umwandlung
	//			2. Rufen Sie mit der oben erstellten Instanz den gew�nschten Vorgang auf (Parameter nicht vergessen).
	//	
	//		BERECHNUNG:
	//			1. Erstelle Sie als erstes eine Instanz der Klasse Berechnungen
	//			2. Rufen Sie mit der oben erstellten Instanz den gew�nschten Vorgang auf (Parameter nicht vergessen).
	
	public static void main(String[] args {
		Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// Celsius in Fahrenheit		Parameter: Zahl

		Zeitmessung Zeitmessung = new Zeitmessung();
		Zeitmessung.startZeit();
		// 

		Umwandlung Umwandlung = new Umwandlung();
		Umwandlung.CelsiusInFahrenheit(32);
		Umwandlung.CelsiusInFahrenheit(10);
		
		// Euro in Franken			Parameter: Anzahl Euros
		System.out.println("Hier wird getestet, wie viele Franken die Angegebenen Euro sind. \nTest Werte: 12� == 13.33CHF.");
		Umwandlung Waehrung = new Umwandlung();
		Waehrung.EuroInFranken(12.0);
		
		// MB in GB					Parameter: Anzahl MB
		Umwandlung mbtogb = new Umwandlung();
		mbtogb.MBinGB(690);
		
		// GB in MB					Parameter: Anzahl in GB
		Umwandlung gbtomb = new Umwandlung();
		gbtomb.GBinMB(125.3);
		
		// Autopreis berechnen		Parameter: Neupreis, Alter in Jahre, PS, Kilometerstand
		AutopreisBerechnen auto = new AutopreisBerechnen(8000.0, 3, 333, 4000.0);
		auto.Berechnung();
		
		// Zufallszahl				Parameter: Obergrenze, Untergrenze
		Berechnungen zufallszahl1= new Berechnungen();
		zufallszahl1.Zufallszahl(15000, 0);	
		
		Berechnungen Berechnungen = new Berechnungen();
		Berechnungen.Zufallszahl(15000, 0);
		Berechnungen.Zufallszahl(15000, 0);
		
		// Sin, Cos, Tan			Parameter: Funktion(Sinus, Cosinus oder Tangens), Einheit(Rad oder Grad), Winkel
		Berechnungen.SinusCosinusTangens("Sinus", "Grad", 90);
		
		Berechnungen.SinusCosinusTangens("Sinus", "Rad", 90);
		
		Berechnungen.SinusCosinusTangens("Cosinus", "Grad", 90);
		
		// Hypothenuse				Parameter: Anakathete, Gegenkathete
		Berechnungen hypothenuse = new Berechnungen();
		hypothenuse.hypothenuse(15, 8);
		// Anakethete				Parameter: Gegenkathete, Hypothenuse
		Berechnungen ankathete = new Berechnungen();
		ankathete.ankathete(8, 30);
		// Gegenkathete				Parameter: Anakathete, Hypothenuse
		Berechnungen gegenkathete = new Berechnungen();
		gegenkathete.gegenkathete(15, 30);
		// PH aus c					Parameter: Stoffmengenkonzentration
		Berechnungen phWert = new Berechnungen();
		phWert.phWert(0.2);

		Berechnungen.SinusCosinusTangens("Cosinus", "Grad", 90);

		Berechnungen mittelwert = new Berechnungen();
		mittelwert.mittelwertRechnung(33);
		
		Berechnungen.SinusCosinusTangens("Cosinus", "Grad", 90);
		
		Zeitmessung.stopZeit();

	}
}
