package controller;

public class Mittelwert 
{
	double speicher = 0;
	boolean mittelwertFirst = true;
	
	public void mittelwertRechnung(double zahl) {
		if (mittelwertFirst == true) {
			System.out.println("\n\n" + zahl + " ist ihre Start-Zahl.");
			speicher = zahl;
			mittelwertFirst = false;
		}
		else {
			zahl = (zahl - speicher)/2;
			speicher = zahl + speicher;
			System.out.printf("Der Mittelwert ist: " + speicher + " Sch�nen Tag noch!\n");
			}
	}
}
