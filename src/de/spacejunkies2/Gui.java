package de.spacejunkies2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {

	public Gui(){
		Var.frame = new JFrame();
		Var.frame.setSize(Var.breite,Var.hoehe);
		Var.frame.setLocationRelativeTo(null);
		Var.frame.setResizable(false);
		Var.frame.setLayout(null);
		Var.frame.setTitle("SpaceJunkies 2.0");
		Var.frame.requestFocus();
		Var.frame.addKeyListener(new Tastatur());
		Var.frame.requestFocus();
		Var.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Var.label = new Label();
		Var.label.setBounds(0, 0, Var.breite, Var.hoehe);
		
		
		Var.btnRestart = new StandardButton("Neustart", 30, 430, 725, 50, false).getButton();
		Var.btnBeenden = new StandardButton("Beenden", 30, 500, 725, 50, false).getButton();
		Var.btnResume = new StandardButton("Weiter", 30, 200, 725, 50, false).getButton();
		
		//Var.frame.addMouseListener(new MouseAdapter() {
		//	public void mouseClicked(MouseEvent e){
		//		System.out.println(e.getPoint());
		//	}
		//});
		
		Var.frame.setVisible(true);
		Var.frame.add(Var.label);
	}
	
}
