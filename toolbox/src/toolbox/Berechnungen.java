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
			System.out.println (roundAndFormat(phWert, 3));
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
		if (SinCosTan == "Sinus")
		{
			Sinus(value);
		}
		else if (SinCosTan == "Cosinus")
		{
			Cosinus(value);
		}
		else if (SinCosTan == "Tangens")
		{
			Tangens(value);
		}
		else if (SinCosTan == "arcSinus")
		{
			arcSinus(value);
		}
		else if (SinCosTan == "arcCosinus")
		{
			arcCosinus(value);
		}
		else if (SinCosTan == "arcTangens")
		{
			arcTangens(value);
		}
		else
		{
			System.out.printf("\nKeine gültige Eingabe für die Funktion! Bitte geben sie eine gültige Funktion an!");
		}
	}
	
	public void Sinus(double angle)
	{
		double Resultat = Math.sin(angle);
		System.out.printf("\nDer Sinus von %4.2f° beträgt %4.2f\n\n\n", angle, Resultat);
	}
	
	public void Cosinus(double angle)
	{
		double Resultat = Math.cos(angle);
		System.out.printf("\nDer Cosinus von %4.2f° beträgt %4.2f\n\n\n", angle, Resultat);
	}
	
	public void Tangens(double angle)
	{
		double Resultat = Math.tan(angle);
		System.out.printf("\nDer Tangens von %4.2f° beträgt %4.2f\n\n\n", angle, Resultat);
	}
	
	public void arcSinus(double Sinus)
	{
		double Resultat = Math.asin(Sinus);
		System.out.printf("\nDer arcSinus von %4.2f beträgt %4.2f\n\n\n", Sinus, Resultat);
	}
	
	public void arcCosinus(double Cosinus)
	{
		double Resultat = Math.acos(Cosinus);
		System.out.printf("\nDer arcCosinus von %4.2f beträgt %4.2f\n\n\n", Cosinus, Resultat);
	}
	
	public void arcTangens(double Tangens)
	{
		double Resultat = Math.atan(Tangens);
		System.out.printf("\nDer arcTangens von %4.2f beträgt %4.2f\n\n\n", Tangens, Resultat);
	}


}


