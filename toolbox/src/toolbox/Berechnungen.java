package toolbox;

import java.lang.Math.*;
import java.math.BigDecimal;
import java.util.Random;

public class Berechnungen {
		
		public void Pythagoras(double ankathete, double gegenkathete, double hypothenuse) {
			if(ankathete==0 && gegenkathete != 0 && hypothenuse != 0) {
				ankathete(gegenkathete, hypothenuse);
			}
			else if ((gegenkathete == 0 && ankathete != 0 && hypothenuse != 0)) {
				gegenkathete(ankathete, hypothenuse);
			} 
			else if ((hypothenuse == 0 && ankathete != 0 && gegenkathete != 0)){
				hypothenuse(ankathete, gegenkathete);
			}
			else {
				System.out.println("Bitte geben Sie Ihre Werte gemäss der Syntax an!");
			}
				
		}
		public void hypothenuse(double ankathete, double gegenkathete) {
			double hypothenuse;
			double a = ankathete;
			double b = gegenkathete;
			hypothenuse = Math.sqrt((a*a)+(b*b));
			System.out.println("Die Hypothenuse ist: " + hypothenuse);
		}
		public void ankathete(double gegenkathete, double hypothenuse) {
			double ankathete;
			double c = hypothenuse;
			double b = gegenkathete;
			ankathete = Math.sqrt((c*c)-(b*b));
			System.out.println("Die Ankathete ist: " + ankathete);
		}
		public void gegenkathete(double ankathete, double hypothenuse) {
			double gegenkathete;
			double c = hypothenuse;
			double a = ankathete;
			gegenkathete = Math.sqrt((c*c)-(a*a));
			System.out.println("Die Gegenkathete ist: " + gegenkathete);
		}
		
		public void phWert(double stoffmengenkonzentration) {
			double phWert;
			double stoff;
			stoff = stoffmengenkonzentration;
			phWert = (-1 * Math.log10(stoff));
			System.out.printf (roundAndFormat(phWert, 3) + "\n\n");
		}		
		
		public void Zufallszahl(int max, int min)
		{
			// Autor: Janosh Björkman

			Random rand = new Random();
			int randomNum = min + (int)(Math.random() * ((max - min) + 1));
			System.out.println("Zufallszahl: "+randomNum);
		}
		
		public String roundAndFormat(final double value, final int frac) { 
	        final java.text.NumberFormat nf = java.text.NumberFormat.getInstance(); 
	        nf.setMaximumFractionDigits(frac); 
	        return nf.format(new BigDecimal(value)); 
	    }

	public void SinusCosinusTangens(String SinCosTan, String AngleMeasure, double value)
	{
		if (AngleMeasure == "Grad")
		{
			value = ((2* Math.PI)/(360))* value;
			chooseFunction(SinCosTan, AngleMeasure, value);
		}
		else if (AngleMeasure == "Rad")
		{
			chooseFunction(SinCosTan, AngleMeasure, value);
		}
		
	}
	public void chooseFunction(String Function, String Winkelmass, double Wert)
	{
		if (Function == "Sinus")
		{
			Sinus(Wert,Winkelmass);
		}
		else if (Function == "Cosinus")
		{
			Cosinus(Wert,Winkelmass);
		}
		else if (Function == "Tangens")
		{
			Tangens(Wert,Winkelmass);
		}
		else if (Function == "arcSinus")
		{
			arcSinus(Wert,Winkelmass);
		}
		else if (Function == "arcCosinus")
		{
			arcCosinus(Wert,Winkelmass);
		}
		else if (Function == "arcTangens")
		{
			arcTangens(Wert,Winkelmass);
		}
		else
		{
			System.out.printf("\nKeine gültige Eingabe für die Funktion! Bitte geben sie eine gültige Funktion an!");
		}
	}

	
	public void Sinus(double angle, String Mass)
	{
		double Resultat = Math.sin(angle);
		if (Mass == "Grad")
		{
			angle = ((360)/(2 * Math.PI))* angle;
			System.out.printf("\nDer Sinus von %4.2f° beträgt %4.2f\n\n\n", angle, Resultat);
		}
		else if (Mass == "Rad")
		{
			System.out.printf("\nDer Sinus von %4.2f rad beträgt %4.2f\n\n\n", angle, Resultat);
		}
	}
	
	public void Cosinus(double angle, String Mass)
	{
		double Resultat = Math.cos(angle);
		if (Mass == "Grad")
		{
			angle = ((360)/(2 * Math.PI))* angle;
			System.out.printf("\nDer Cosinus von %4.2f° beträgt %4.2f\n\n\n", angle, Resultat);
		}
		else if (Mass == "Rad")
		{
			System.out.printf("\nDer Cosinus von %4.2f rad beträgt %4.2f\n\n\n", angle, Resultat);
		}
		
	}
	
	public void Tangens(double angle, String Mass)
	{
		double Resultat = Math.tan(angle);
		if (Mass == "Grad")
		{
			angle = ((360)/(2 * Math.PI))* angle;
			System.out.printf("\nDer Tangens von %4.2f° beträgt %4.2f\n\n\n", angle, Resultat);
		}
		else if (Mass == "Rad")
		{
			System.out.printf("\nDer Tangens von %4.2f rad beträgt %4.2f\n\n\n", angle, Resultat);
		}
		
	}
	
	public void arcSinus(double Sinus, String Mass)
	{
		double Resultat = Math.asin(Sinus);
		if (Mass == "Grad")
		{
			Sinus = ((360)/(2 * Math.PI))* Sinus;
			System.out.printf("\nDer arcSinus von %4.2f beträgt %4.2f°\n\n\n", Sinus, Resultat);
		}
		else if (Mass == "Rad")
		{
			System.out.printf("\nDer arcSinus von %4.2f beträgt %4.2f rad\n\n\n", Sinus, Resultat);	
		}
		
	}
	
	public void arcCosinus(double Cosinus, String Mass)
	{
		double Resultat = Math.acos(Cosinus);
		if (Mass == "Grad")
		{
			Cosinus = ((360)/(2 * Math.PI))* Cosinus;
			System.out.printf("\nDer arcCosinus von %4.2f beträgt %4.2f°\n\n\n", Cosinus, Resultat);
		}
		else if (Mass == "Rad")
		{
			System.out.printf("\nDer arcCosinus von %4.2f beträgt %4.2f rad\n\n\n", Cosinus, Resultat);
		}
		
	}
	
	public void arcTangens(double Tangens, String Mass)
	{
		double Resultat = Math.atan(Tangens);
		if (Mass == "Grad")
		{
			Tangens = ((360)/(2 * Math.PI))* Tangens;
			System.out.printf("\nDer arcTangens von %4.2f beträgt %4.2f°\n\n\n", Tangens, Resultat);
		}
		else if (Mass == "Rad")
		{
			System.out.printf("\nDer arcTangens von %4.2f beträgt %4.2f rad\n\n\n", Tangens, Resultat);
		}
		
	}

}


