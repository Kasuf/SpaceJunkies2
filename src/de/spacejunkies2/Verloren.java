package de.spacejunkies2;
import java.util.Timer;
import java.util.TimerTask;

public class Verloren {

	Timer timer;
	int tmp = 0;

	public Verloren() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if(Var.gestartet && Var.verloren){
					if(tmp == 0){
						tmp ++;
						Var.imSpiel = false;
						Var.btnRestart.setVisible(true);
						Var.btnBeenden.setVisible(true);
						Var.btnRestart.requestFocus();
						Var.frame.requestFocus();
						
					}
					
					
					if (tmp >= 1 && tmp <=10) {
						tmp++;
					} else if (tmp == 11) {
						tmp = 0;
						
					}
				}
			}

		}, 0, 15);
	}
}
