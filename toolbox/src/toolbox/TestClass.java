package toolbox;

public class TestClass {

	public static void main(String[] args) 
	{

		Umwandlung Umwandlung = new Umwandlung();
		Umwandlung.CelsiusInFahrenheit(32);
		Umwandlung.CelsiusInFahrenheit(10);
		
		Umwandlung Waehrung = new Umwandlung();
		Waehrung.EuroInFranken(12.0);
		
		Umwandlung mbtogb = new Umwandlung();
		mbtogb.MBinGB(690);
		
		Umwandlung gbtomb = new Umwandlung();
		gbtomb.GBinMB(125.3);
	}
}
