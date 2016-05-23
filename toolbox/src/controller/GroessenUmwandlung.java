package controller;

public class GroessenUmwandlung 
{
	public void GBinMB(double wert)
	{
		double mb = wert*1024;
		System.out.printf("\n%4.2f GB entsprechen %4.2f MB\n\n\n", wert, mb);
	}
	
	public void MBinGB(double wert)
	{
		// Autor: Janosh Björkman
		double gb = wert/1024;
		System.out.printf("\n%4.2f MB entsprechen %4.2f GB\n\n\n", wert, gb);
	}
}
