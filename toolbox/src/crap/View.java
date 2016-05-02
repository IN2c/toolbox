package crap;

import javax.swing.*;
import java.awt.*;

public class View {
	
private JFrame fenster;

    public View()
    {
        fensterErzeugen();
    }

    private void dateiOeffnen()
    {
       System.out.println("Menüeintrag: Öffnen via Methode mittels"
               + " eigenem actionPerformed");
    }
    
    private void dateiSpeichern()
    {
        System.out.println("Menüeintrag: Speichern via Methode mittels"
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
        
        JButton butcrap = new JButton("crapcrapcap");
        contentPane.add(butcrap);
        butcrap.addActionListener(e -> {fenster.dispose();});

        // Aufbau abgeschlossen - Komponenten arrangieren lassen
        fenster.pack();
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    private void menuezeileErzeugen(JFrame fenster)
    {
        JMenuBar menueZeile = new JMenuBar();
        fenster.setJMenuBar(menueZeile);
                
        // Das Datei-Menü erzeugen
        JMenu dateiMenue = new JMenu("Datei");
        menueZeile.add(dateiMenue);
        
        JMenuItem oeffnenEintrag = new JMenuItem("Öffnen");
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