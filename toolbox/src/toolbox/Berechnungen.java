package toolbox;

import java.lang.Math.*;
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
			phWert = -Math.log(stoff);
			System.out.println(phWert);
		}		
		
		public void Zufallszahl(int max, int min)
		{
			// Autor: Janosh Björkman

			Random rand = new Random();
			int randomNum = min + (int)(Math.random() * ((max - min) + 1));
			System.out.println("Zufallszahl: "+randomNum);
		}

	public void SinusCosinusTangens(String SinCosTan, double AngleMeasure)
	{
		if (SinCosTan == "Sinus")
		{
			Sinus(AngleMeasure);
		}
		else if (SinCosTan == "Cosinus")
		{
			Cosinus(AngleMeasure);
		}
		else if (SinCosTan == "Tangens")
		{
			Tangens(AngleMeasure);
		}
		else if (SinCosTan == "arcSinus")
		{
			arcSinus(AngleMeasure);
		}
		else if (SinCosTan == "arcCosinus")
		{
			arcCosinus(AngleMeasure);
		}
		else if (SinCosTan == "arcTangens")
		{
			arcTangens(AngleMeasure);
		}
	}
	
	public void Sinus(double angle)
	{
		Math.sin(angle);
	}
	
	public void Cosinus(double angle)
	{
		Math.cos(angle);
	}
	
	public void Tangens(double angle)
	{
		Math.tan(angle);
	}
	
	public void arcSinus(double Sinus)
	{
		Math.asin(Sinus);
	}
	
	public void arcCosinus(double Cosinus)
	{
		Math.acos(Cosinus);
	}
	
	public void arcTangens(double Tangens)
	{
		Math.atan(Tangens);
	}


}


