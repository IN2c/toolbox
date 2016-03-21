package toolbox;

import java.util.Random;

public class Berechnungen {
	
	public void Pythagoras()
	{
		
	}
	
	public void phWert()
	{
		
	}
	
	public void Zufallszahl(int max, int min)
	{
		// Autor: Janosh Björkman
		
		Random rand = new Random();
	    int randomNum = min + (int)(Math.random() * ((max - min) + 1));
	    System.out.println("Zufallszahl: "+randomNum);
	}
}
