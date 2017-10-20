package de.spacejunkies2;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class StandardButton {
	
	private JButton tmp;
	
	public StandardButton(String name,int x,int y,int breite,int hoehe,boolean sichtbar) {
		tmp = new JButton();
		tmp.setText(name);
		tmp.setBounds(x, y, breite, hoehe);
		tmp.setVisible(sichtbar);
		tmp.addActionListener(new ActionHandler());
		tmp.setBackground(new Color(0,0,0,200));
		tmp.setFont(new Font("Arial",Font.BOLD,30));
		tmp.setForeground(Color.WHITE);
		tmp.setBorder(null);
		tmp.setFocusPainted(false);
		
		Var.frame.add(tmp);
	}
	
	public JButton getButton(){
		return (JButton)tmp;
	}
	

}
