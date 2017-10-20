package de.spacejunkies2;
import java.util.Timer;
import java.util.TimerTask;

public class KollisionGegner{

	Timer timer;
	int tmp = 0;

	public KollisionGegner() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if(Var.gestartet && Var.imSpiel){
					if (tmp == 0) {
						for (int i = 0; i < Var.anzahlGegner; ++i) {

							if (Var.raketeX >= Var.gegnerX[i] - 32 && Var.raketeX <= Var.gegnerX[i] + 45
									&& Var.raketeY >= Var.gegnerY[i] - 63 && Var.raketeY <= Var.gegnerY[i] + 53) { // 50 -> 55
								
								Var.posGegnerX = Var.gegnerX[i];
								Var.posGegnerY = Var.gegnerY[i];
								Var.gifExp.flush();
								Var.kollidiert = true;
								Var.gegnerY[i] = (int) Math.round(Math.random() * (-100 - (200) + 1) + -(200));
								tmp++;
								Var.gegnerX[i] = Var.gegnerX[i] = (int) Math.round(Math.random() * (750 - 20 + 1) + 20);
								Var.gegnerVel[i] = (int) Math.round(Math.random() * (4 - 2 + 1) + 2);

								if(Var.leben >= 1){
									Var.leben --;
								}
								if(Var.leben == 0){
									try {
										Thread.sleep(580);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
									Var.verloren = true;
									Var.Pause = false;
									Tastatur.tmp = 0;
								}
							}

						}
					}

					if (tmp >= 1 && tmp <= 45) {
						tmp++;
					} else if (tmp == 46) {
						tmp = 0;
						Var.kollidiert = false;
					}

				}
				
			}

		}, 0, 20);
	}

}
