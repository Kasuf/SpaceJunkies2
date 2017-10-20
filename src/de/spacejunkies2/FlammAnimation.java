package de.spacejunkies2;
import java.util.Timer;
import java.util.TimerTask;

public class FlammAnimation {

	Timer timer;
	public FlammAnimation(){
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				
				if(Var.gestartet && Var.imSpiel){

					if(Var.flammenAnimation){
						Var.flammenAnimation = false;
					}
					else if(!Var.flammenAnimation){
						Var.flammenAnimation = true;
					}
					
				}
				
			}
			
		}, 0, 100);
	}
	
}
