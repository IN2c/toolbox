package view;

import java.awt.Container;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.ButtonGroup;

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
        fenster.setDefaultCloseOperation(fenster.DISPOSE_ON_CLOSE);
        
        Container contentPane = fenster.getContentPane();

        // Aufbau abgeschlossen - Komponenten arrangieren lassen
        //fenster.setSize(500, 500);
        fenster.pack();
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

	    //Group the radio buttons.
	    Group.add(arcsin);
	    Group.add(arccos);
	    Group.add(arctan);
	    
	    fenster.add(sin);
	    fenster.add(cos);
	    fenster.add(tan);
	    
	    //paint();
	    
	    fenster.add(arcsin);
	    fenster.add(arccos);
	    fenster.add(arctan);
	    
	    fenster.setLayout( new GridLayout(2,3));
	    fenster.setVisible(true);
	}
	public void paint(Graphics g){
 	   g.drawLine(0, 0, 100, 100);
	}
}
