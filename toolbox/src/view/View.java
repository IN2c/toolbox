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
        fenster = new JFrame("Hauptmenü");
        menuezeileErzeugen(fenster);
        
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.X_AXIS));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        mainpanel.add(panel1);
        mainpanel.add(panel2);
        
        // panel1
        JButton button = new JButton("Celsius - Fahremheit");
        button.setFont(new Font("Terminal", Font.BOLD, 20));
        button.addActionListener(e -> {fenster.dispose();});
        panel1.add(button);
        
        button = new JButton("CHF - Euro");
        button.setFont(new Font("Terminal", Font.BOLD, 20));
        panel1.add(button);
        
        button = new JButton("MB - GB");
        button.setFont(new Font("Terminal", Font.BOLD, 20));
        panel1.add(button);
        
        // panel2
        button = new JButton("Autopreis");
        button.setFont(new Font("Terminal", Font.BOLD, 20));
        button.addActionListener(e -> {fenster.dispose();});
        panel2.add(button);
        
        button = new JButton("Zufallszahl");
        button.setFont(new Font("Terminal", Font.BOLD, 20));
        panel2.add(button);
        
        button = new JButton("Sin,Cos,Tan");
        button.setFont(new Font("Terminal", Font.BOLD, 20));
        panel2.add(button);

        // Windowlocation       
        fenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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