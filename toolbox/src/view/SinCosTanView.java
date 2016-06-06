package view;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public class SinCosTanView 
{
	private JFrame fenster;
	
	public SinCosTanView()
	{
		fensterErzeugen();
	}
	
	private void fensterErzeugen()
    {
        fenster = new JFrame("SinCosTan");
        menuezeileErzeugen(fenster);
        RadioButtons(fenster);
        rest(fenster);
        fenster.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        // Aufbau abgeschlossen - Komponenten arrangieren lassen
        fenster.setSize(600, 400);
        //fenster.pack();
        fenster.setVisible(true);
    }
	
	private void menuezeileErzeugen(JFrame fenster)
    {
        JMenuBar menueZeile = new JMenuBar();
        fenster.setJMenuBar(menueZeile);
                
        // Das Datei-Menü erzeugen
        JMenu dateiMenue = new JMenu("Datei");
        menueZeile.add(dateiMenue);
        
        JMenuItem schliessenEintrag = new JMenuItem("Schliessen");
        schliessenEintrag.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){dateiSchliessen();}
        }); 
        dateiMenue.add(schliessenEintrag);
        
       JMenu hilfeMenue = new JMenu("Hilfe");
       menueZeile.add(hilfeMenue);
       
       JMenuItem infoEintrag = new JMenuItem("Info");
        infoEintrag.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){dateiHilfe();}
        }); 
       hilfeMenue.add(infoEintrag);
    }
	
	public void dateiHilfe()
	{
		System.out.println("Info");
	}
	
	public void dateiSchliessen()
	{
		fenster.dispose();
	}
	
	public void rest(JFrame fenster)
	{
		JLabel wert = new JLabel("Wert: ");
		fenster.add(wert);
		
		
		
		JLabel result = new JLabel("Resultat: ");
		fenster.add(result);
		
		JPanel north = new JPanel();
	    north.add(wert);
	    JTextArea textArea = new JTextArea(4, 10);
	    JScrollPane scrollPane = new JScrollPane(textArea);
		north.add(scrollPane);
	    
	    north.add(result);
	    
	    JTextArea textArea1 = new JTextArea(4, 10);
	    JScrollPane scrollPane1 = new JScrollPane(textArea1);
		north.add(scrollPane1);
	    fenster.add(north, BorderLayout.SOUTH);
	}
	
	public void RadioButtons(JFrame fenster)
	{
		
		JRadioButton sin = new JRadioButton("Sin");
	    sin.setMnemonic(KeyEvent.VK_B);
	    sin.setActionCommand("Sin");
	    sin.setSelected(true);
	    
	    JRadioButton cos = new JRadioButton("Cos");
	    cos.setMnemonic(KeyEvent.VK_C);
	    cos.setActionCommand("Cos");
	    cos.setSelected(false);

	    JRadioButton tan = new JRadioButton("Tan");
	    tan.setMnemonic(KeyEvent.VK_D);
	    tan.setActionCommand("Tan");
	    tan.setSelected(false);

	    //Group the radio buttons.
	    ButtonGroup Group = new ButtonGroup();
	    Group.add(sin);
	    Group.add(cos);
	    Group.add(tan);
	    
	    JRadioButton arcsin = new JRadioButton("ArcSin");
	    arcsin.setMnemonic(KeyEvent.VK_B);
	    arcsin.setActionCommand("ArcSin");
	    arcsin.setSelected(true);
	    
	    JRadioButton arccos = new JRadioButton("ArcCos");
	    arccos.setMnemonic(KeyEvent.VK_C);
	    arccos.setActionCommand("ArcCos");
	    arccos.setSelected(false);

	    JRadioButton arctan = new JRadioButton("ArcTan");
	    arctan.setMnemonic(KeyEvent.VK_D);
	    arctan.setActionCommand("ArcTan");
	    arctan.setSelected(false);
	    
	    JRadioButton deg = new JRadioButton("DEG");
	    deg.setMnemonic(KeyEvent.VK_C);
	    deg.setActionCommand("DEG");
	    deg.setSelected(true);

	    JRadioButton rad = new JRadioButton("RAD");
	    rad.setMnemonic(KeyEvent.VK_D);
	    rad.setActionCommand("RAD");
	    rad.setSelected(false);

	    JPanel north1 = new JPanel();
	    north1.add(deg);
	    north1.add(rad);
	    fenster.add(north1, BorderLayout.NORTH);
	    
	    
	    
	    //Group the radio buttons.
	    Group.add(arcsin);
	    Group.add(arccos);
	    Group.add(arctan);
	    /*
	    fenster.add(sin);
	    fenster.add(cos);
	    fenster.add(tan);
	    
	    //linie
	    
	    fenster.add(arcsin);
	    fenster.add(arccos);
	    fenster.add(arctan);
	    */
	    //linie
	    JPanel center = new JPanel();
	    center.add(sin);
	    center.add(cos);
	    center.add(tan);
	    center.add(arcsin);
	    center.add(arccos);
	    center.add(arctan);
	    fenster.add(center, BorderLayout.BEFORE_LINE_BEGINS);
	    center.setLayout(new GridLayout(2,3));
	    
	    ButtonGroup Group1 = new ButtonGroup();
	    Group1.add(deg);
	    Group1.add(rad);
	    
	    fenster.setResizable(false);
	    fenster.setVisible(true);
	}
}
