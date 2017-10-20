package de.spacejunkies2;
import java.util.Timer;
import java.util.TimerTask;

public class GifExp {

	Timer timer;
	static int tmp = 0;
	public GifExp() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				if(Var.gestartet && Var.kollidiert){
					//if(Var.kollidiert){
						if(tmp < 30){
							tmp++;
						}
						else if(tmp == 30){
							Var.gifExp.flush();
							tmp = 0;
							Var.kollidiert = false;
						}
					}
				//}
				
			}
			
		}, 0, 20);
	}

}
