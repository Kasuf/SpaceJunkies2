package de.spacejunkies2;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Var {

	static JFrame frame;
	
	static int breite = 800;
	static int hoehe = 600;
	
	static int punkte = 0;
	
	static int hintergrundY1 = 0;
	static int hintergrundY2 = -600;
	
	static int raketeX = 375;
	static int raketeY = 400;
	
	static boolean kollidiert = false;
	static boolean verloren = false;
	
	static int anzahlGegner = 9;
	
	static int leben = 2;
	
	static boolean flammenAnimation = true;
	
	static int[] gegnerX = new int[anzahlGegner];
	static int[] gegnerY = new int[anzahlGegner];
	static int[] gegnerVel = new int[anzahlGegner];
	
	static int posGegnerX = 0;
	static int posGegnerY = 0;
	
	static GegnerKreis[] gegnerOval = new GegnerKreis[anzahlGegner];
	
	static boolean hoch = false;
	static boolean runter = false;
	static boolean links = false;
	static boolean rechts = false;
	static boolean bewegung = false;
	
	static boolean imSpiel = true;
	static boolean Pause = false;
	static boolean start = false;
	static boolean gestartet = false;
	
	static int velHoch = 3;
	static int velRunter = 2;
	static int velLinks = 2;
	static int velRechts = 2;
	
	static Label label;
	
	static BufferedImage hintergrund1;
	static BufferedImage hintergrund2;
	static BufferedImage rakete;
	static BufferedImage gegner;
	static BufferedImage gegnerTest;
	
	static BufferedImage flamme1;
	static BufferedImage flamme2;
	
	static BufferedImage flammeBoost;
	static BufferedImage flammeBoost2;
	
	static Image gifExp;
	
	static BufferedImage flammeSlow;
	static BufferedImage flammeSlow2;
	
	static JButton btnRestart;
	static JButton btnBeenden;
	static JButton btnResume;
	
	public Var(){
		try{
			hintergrund1 = ImageIO.read(ResourceLoader.laden("/Hintergrund.png"));
			hintergrund2 = ImageIO.read(ResourceLoader.laden("/Hintergrund.png"));
			
			rakete = ImageIO.read(ResourceLoader.laden("/Rakete.png"));
			flamme1 = ImageIO.read(ResourceLoader.laden("/FlammeStandard.png"));
			flamme2 = ImageIO.read(ResourceLoader.laden("/FlammeStandard2.png"));
			
			
			flammeBoost = ImageIO.read(ResourceLoader.laden("/FlammeBoost1.png"));
			flammeBoost2 = ImageIO.read(ResourceLoader.laden("/FlammeBoost2.png"));
			
			
			flammeSlow = ImageIO.read(ResourceLoader.laden("/FlammeSlow1.png"));
			flammeSlow2 = ImageIO.read(ResourceLoader.laden("/FlammeSlow2.png"));
		
			gifExp = Toolkit.getDefaultToolkit().createImage(org.apache.commons.io.IOUtils.toByteArray(ResourceLoader.laden("/expGif.gif")));
			
			gegner = ImageIO.read(ResourceLoader.laden("/Gegner.png"));
			
			gegnerTest = ImageIO.read(ResourceLoader.laden("/TestGegner.png"));
			
			
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("Fehler beim Laden eines Bildes");
		}
	}
	
}
