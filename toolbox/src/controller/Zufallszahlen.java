package controller;

public class Zufallszahlen 
{
	public void Zufallszahl(int max, int min)
	{
		// Autor: Janosh Bj�rkman

		//Random rand = new Random();
		int randomNum = min + (int)(Math.random() * ((max - min) + 1));
		System.out.println("Zufallszahl: "+randomNum);
	}
}
