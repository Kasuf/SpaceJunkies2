package de.spacejunkies2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.IOException;

import javax.swing.JLabel;

public class Label extends JLabel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawImage(Var.hintergrund1, 0, Var.hintergrundY1, 800, 600, null);
		g.drawImage(Var.hintergrund2, 0, Var.hintergrundY2, 800, 600, null);

		g.drawImage(Var.rakete, Var.raketeX, Var.raketeY, 50, 70, null);

		// flammeBoost
		if (Var.hoch) {
			if (Var.flammenAnimation) {
				g.drawImage(Var.flammeBoost, Var.raketeX, Var.raketeY + 67, 50, 25, null);
			} else if (!Var.flammenAnimation) {
				g.drawImage(Var.flammeBoost2, Var.raketeX, Var.raketeY + 67, 50, 25, null);
			}
		}
		// flammeSlow
		else if (Var.runter) {
			if (Var.flammenAnimation) {
				g.drawImage(Var.flammeSlow, Var.raketeX, Var.raketeY + 67, 50, 10, null);
			} else if (!Var.flammenAnimation) {
				g.drawImage(Var.flammeSlow2, Var.raketeX, Var.raketeY + 67, 50, 10, null);
			}
		}
		// flammeLinks
		else if (Var.links) {
			if (Var.flammenAnimation) {
				g.drawImage(Var.flamme1, Var.raketeX, Var.raketeY + 67, 50, 20, null);
			} else if (!Var.flammenAnimation) {
				g.drawImage(Var.flamme2, Var.raketeX, Var.raketeY + 67, 50, 20, null);
			}
		}
		// flammeRechts
		else if (Var.rechts) {
			if (Var.flammenAnimation) {
				g.drawImage(Var.flamme1, Var.raketeX, Var.raketeY + 67, 50, 20, null);
			} else if (!Var.flammenAnimation) {
				g.drawImage(Var.flamme2, Var.raketeX, Var.raketeY + 67, 50, 20, null);
			}
		}
		// flammeStandard
		else if (!Var.bewegung) {
			if (Var.flammenAnimation) {
				g.drawImage(Var.flamme1, Var.raketeX, Var.raketeY + 67, 50, 20, null);
			} else if (!Var.flammenAnimation) {
				g.drawImage(Var.flamme2, Var.raketeX, Var.raketeY + 67, 50, 20, null);
			}

		}

		for (int i = 0; i < Var.anzahlGegner; ++i) {
			Var.gegnerOval[i] = new GegnerKreis(Var.gegnerX[i], Var.gegnerY[i], 65, 60);
			// Var.gegnerOval[i].kreisMalen(g);
			g.drawImage(Var.gegner, Var.gegnerX[i], Var.gegnerY[i], 65, 60, null);
		}

		if (Var.gestartet && Var.Pause) {
			g.setColor(new Color(105, 105, 105, 120));
			g.fillRect(0, 0, Var.breite, Var.hoehe);

			g.setColor(new Color(150, 0, 0, 250));
			g.setFont(new Font("Arial", Font.BOLD, 40));
			g.drawString("Pause", 340, 50);
		}

		else if (Var.gestartet && Var.imSpiel && !Var.Pause) {
			if (Var.kollidiert) {
				g.drawImage(Var.gifExp, Var.posGegnerX - 20, Var.posGegnerY - 15, 105, 95, null);
				g.setColor(new Color(230, 0, 0, 20));
				g.fillRect(0, 0, Var.breite, Var.hoehe);

			}
			g.setColor(Color.GREEN.darker());
			g.setFont(new Font("Arial", Font.BOLD, 20));
			g.drawString("Punkte: " + Var.punkte, 0, 35);
		}

		else if (Var.gestartet && !Var.imSpiel && !Var.Pause) {

			g.setColor(new Color(230, 0, 0, 20));
			g.fillRect(0, 0, Var.breite, Var.hoehe);

			g.setColor(Color.GRAY.darker());
			g.setFont(new Font("Arial", Font.BOLD, 40));
			g.drawString("Verloren", 320, 150);
			
			g.setColor(Color.GREEN.brighter());
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("Du hast " + Var.punkte + " Punkte erreicht", 250, 300);

		} else if (!Var.gestartet) {
			g.setColor(new Color(105, 105, 105, 120));
			g.fillRect(0, 0, Var.breite, Var.hoehe);

			g.setColor(new Color(190, 190, 190, 250));
			g.setFont(new Font("Arial", Font.BOLD, 40));
			g.drawString("Drücke 'Space' zum starten", 142, 250);
		}

		repaint();

	}
}
