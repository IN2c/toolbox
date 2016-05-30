package view;
import controller.*;
import javax.swing.*;
import java.awt.*;

public class View 
{
	private JFrame fenster;

    public View()
    {
        fensterErzeugen();
    }

    private void dateiOeffnen()
    {
       System.out.println("Men�eintrag: �ffnen via Methode mittels"
               + " eigenem actionPerformed");
    }
    
    private void dateiSpeichern()
    {
        System.out.println("Men�eintrag: Speichern via Methode mittels"
               + " eigenem actionPerformed");
    }
    
    public void dateiBeenden()
    {
        fenster.dispose();
    }
            
    // ---- Swing-Anteil zum Erzeugen des Fensters mit allen Komponenten ----
    
    private void fensterErzeugen()
    {
        fenster = new JFrame("Bildbetrachter");
        menuezeileErzeugen(fenster);
        
        Container contentPane = fenster.getContentPane();
        
        JButton celsuisFahrenheit = new JButton("Celsius - Fahremheit");
        contentPane.add(celsuisFahrenheit);
        celsuisFahrenheit.addActionListener(e -> {fenster.dispose();});
        JButton autopreis = new JButton("Autopreis");
        contentPane.add(autopreis);
        autopreis.addActionListener(e -> {fenster.dispose();}); 

        // Aufbau abgeschlossen - Komponenten arrangieren lassen        
        fenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fenster.setLayout(new GridLayout(5, 2));
        fenster.setLocationRelativeTo(null);
        fenster.setPreferredSize(new Dimension(600, 600));
        fenster.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
        Point newLocation = new Point(middle.x - (fenster.getWidth() / 2), 
                                      middle.y - (fenster.getHeight() / 2));
        fenster.setLocation(newLocation);
        fenster.setVisible(true);
    }
    
    private void menuezeileErzeugen(JFrame fenster)
    {
        JMenuBar menueZeile = new JMenuBar();
        fenster.setJMenuBar(menueZeile);
                
        // Das Datei-Men� erzeugen
        JMenu dateiMenue = new JMenu("Datei");
        menueZeile.add(dateiMenue);
        
        JMenuItem oeffnenEintrag = new JMenuItem("�ffnen");
        oeffnenEintrag.addActionListener(e -> dateiOeffnen());
        dateiMenue.add(oeffnenEintrag);
        
        JMenuItem speichernEintrag = new JMenuItem("Speichern");
        speichernEintrag.addActionListener(e -> dateiSpeichern());
        dateiMenue.add(speichernEintrag);
        
        JMenuItem beendenEintrag = new JMenuItem("Beenden");
        beendenEintrag.addActionListener(e -> dateiBeenden());
        dateiMenue.add(beendenEintrag);
    }
}