package de.spacejunkies2;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tastatur implements KeyListener {

	static int tmp = 0;
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(Var.gestartet && Var.imSpiel){

			if(e.getKeyCode() == KeyEvent.VK_W){
				Var.hoch = true;
				Var.bewegung = true;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_S){
				Var.runter = true;
				Var.bewegung = true;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_A){
				Var.links = true;
				Var.bewegung = true;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_D){
				Var.rechts = true;
				Var.bewegung = true;
			}
		
		}
		
		if(Var.gestartet && tmp == 0 && Var.imSpiel){
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
				Var.Pause = true;
				Var.imSpiel = false;
				Var.btnResume.setVisible(true);
				Var.btnRestart.setVisible(true);
				Var.btnRestart.setBounds(30, 270, 725, 50);
				tmp ++;
			}
		}
		else if(Var.gestartet && tmp == 1){
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
				Var.Pause = false;
				Var.imSpiel = true;
				Var.hoch = false;
				Var.runter = false;
				Var.links = false;
				Var.rechts = false;
				Var.bewegung = false;
				Var.btnResume.setVisible(false);
				Var.btnRestart.setVisible(false);
				Var.btnRestart.setBounds(30, 430, 725, 50);
				tmp --;
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			Var.gestartet = true;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(Var.gestartet && Var.imSpiel){
			if(e.getKeyCode() == KeyEvent.VK_W){
				Var.hoch = false;
				Var.bewegung = false;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_S){
				Var.runter = false;
				Var.bewegung = false;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_A){
				Var.links = false;
				Var.bewegung = false;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_D){
				Var.rechts = false;
				Var.bewegung = false;
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {}

}
