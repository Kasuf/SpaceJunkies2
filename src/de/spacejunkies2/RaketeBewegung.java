package de.spacejunkies2;
import java.util.Timer;
import java.util.TimerTask;

public class RaketeBewegung {

	Timer timer;
	public RaketeBewegung(){
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				
				if(Var.gestartet && Var.imSpiel){
					if(Var.hoch){
						if(Var.raketeY>0){
							Var.raketeY -= Var.velHoch;
						}
					}
					else if(Var.runter){
						if(Var.raketeY<=495){
							Var.raketeY += Var.velRunter;
						}
					}
					
					if(Var.links){
						if(Var.raketeX>0){
							Var.raketeX -= Var.velLinks;
						}
					}
					else if(Var.rechts){
						if(Var.raketeX<=750){
							Var.raketeX += Var.velRechts;
						}
					}
				}
				
				
				
			}
			
		}, 0, 10);
	}
	
}
