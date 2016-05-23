package controller;

import java.math.BigDecimal;

public class PHwert 
{
	public void phWert(double stoffmengenkonzentration) {
		double phWert;
		double stoff;
		stoff = stoffmengenkonzentration;
		phWert = (-1 * Math.log10(stoff));
		System.out.printf (roundAndFormat(phWert, 3) + "\n\n");
	}
	
	public String roundAndFormat(final double value, final int frac) { 
        final java.text.NumberFormat nf = java.text.NumberFormat.getInstance(); 
        nf.setMaximumFractionDigits(frac); 
        return nf.format(new BigDecimal(value)); 
    }
}
