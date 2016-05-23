package controller;

public class LineareFunktion 
{
	public void lineareFunktion(double x1, double y1, double x2, double y2, double x3){
		double deltaY = y2-y1;
		double deltaX = x2-x1;
		double a = deltaY/deltaX;
		double b = y1/(a*x3);
		double y3 = a*x3+b;
		System.out.printf("\nDer neue Punkt hat die Koordinaten (x/y) (%4.2f/%4.2f)\n", x3, y3);
	}
}
