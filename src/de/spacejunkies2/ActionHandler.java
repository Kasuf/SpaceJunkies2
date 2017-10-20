package de.spacejunkies2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	public ActionHandler() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Var.btnRestart){
			
			Var.imSpiel = true;
			Var.gestartet = false;
			Var.Pause = false;
			Var.leben = 2;
			Var.verloren = false;
			Var.btnRestart.setVisible(false);
			Var.btnBeenden.setVisible(false);
			Var.btnResume.setVisible(false);
			Var.frame.requestFocus();
			
			Var.raketeX = 375;
			Var.raketeY = 400;
			Var.punkte = 0;
			
			Tastatur.tmp = 0;
			
			Var.hoch = false;
			Var.runter = false;
			Var.links = false;
			Var.rechts = false;
			Var.bewegung = false;
			
			
			for(int i=0;i<Var.anzahlGegner;++i){
				Var.gegnerX[i] = (int) Math.round(Math.random()* (750-20+1)+ 20);
				Var.gegnerY[i] = (int) Math.round(Math.random() * (-100 - (300) + 1) + -(300));
				Var.gegnerVel[i] = (int)Math.round(Math.random()*(4-3+1)+3);
			}
			
		}
		
		if(e.getSource() == Var.btnBeenden){
			System.exit(0);
		}
		
		if(e.getSource() == Var.btnResume){
			Var.Pause = false;
			Var.imSpiel = true;
			Var.btnResume.setVisible(false);
			Var.btnRestart.setVisible(false);
			Var.btnRestart.setBounds(30, 430, 725, 50);
			Tastatur.tmp = 0;
			Var.hoch = false;
			Var.runter = false;
			Var.links = false;
			Var.rechts = false;
			Var.bewegung = false;
			Var.frame.requestFocus();
		}
		
	}

}