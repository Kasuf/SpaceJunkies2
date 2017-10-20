package de.spacejunkies2;
import java.util.Timer;
import java.util.TimerTask;

public class Punkte {

	Timer timer;
	public Punkte() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				if(Var.gestartet && Var.imSpiel){
					Var.punkte += 1;
				}
			}
			
		}, 0, 50);
	}

}
