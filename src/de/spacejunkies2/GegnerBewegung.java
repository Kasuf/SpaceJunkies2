package de.spacejunkies2;
import java.util.Timer;
import java.util.TimerTask;

public class GegnerBewegung {

	Timer timer;

	public GegnerBewegung() {
		timer = new Timer();

		for (int i = 0; i < Var.anzahlGegner; ++i) {
			//Var.gegnerX[i] = 300;
			//Var.gegnerY[i] = 300;
			//Var.gegnerVel[i] = ;
			Var.gegnerX[i] = (int) Math.round(Math.random() * (720 - 30 + 1) + 30);
			Var.gegnerY[i] = (int) Math.round(Math.random() * (-100 - (300) + 1) + -(300));
			Var.gegnerVel[i] = (int) Math.round(Math.random() * (4 - 3 + 1) + 3);

		}

		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.gestartet && Var.imSpiel) {
					for (int i = 0; i < Var.anzahlGegner; ++i) {

						for (int j = i + 1; j < Var.anzahlGegner; ++j) {
							if(Var.gegnerY[i] <= -40){
									if (Var.gegnerOval[i].kollision(Var.gegnerOval[i].getX(), Var.gegnerOval[i].getY(),
											Var.gegnerOval[i].getBreite(), Var.gegnerOval[i].getHoehe(),
											Var.gegnerOval[j].getX(), Var.gegnerOval[j].getY(), Var.gegnerOval[j].getBreite(),
											Var.gegnerOval[j].getHoehe())) {
											Var.gegnerX[i] += 40;
											
										}
									if(Var.gegnerX[i] >= 730){
										Var.gegnerX[i] -= (int) Math.round(Math.random() * (40 - (100) +1 ) + (100));
										Var.gegnerY[i] -= (int) Math.round(Math.random() * (40 - (100) +1) + (100));
									}
									}
						
						}

						Var.gegnerY[i] += Var.gegnerVel[i];

						if (Var.gegnerY[i] >= Var.hoehe) {
							Var.gegnerY[i] = (int) Math.round(Math.random() * (-100 - (-250) + 1) + -(250));
							Var.gegnerX[i] = (int) Math.round(Math.random() * (720 - 20 + 1) + 20);
							Var.gegnerVel[i] = (int) Math.round(Math.random() * (4 - 3 + 1) + 3);
							 //Var.gegnerY[i] = 300;
							 //Var.gegnerVel[i]= 0;
							 //Var.gegnerX[i] = 300;
						}

					}
				}

			}

		}, 0, 9);
	}

}
