package de.spacejunkies2;
import java.util.Timer;
import java.util.TimerTask;

public class Hintergrund {

	Timer timer;

	public Hintergrund() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.gestartet && Var.imSpiel) {
					if (Var.hintergrundY1 < 595) {
						Var.hintergrundY1 += 2;
					} else {
						Var.hintergrundY1 = -600;
					}

					if (Var.hintergrundY2 < 595) {
						Var.hintergrundY2 += 2;
					} else {
						Var.hintergrundY2 = -600;
					}
				}

			}

		}, 0, 9);
	}

}
