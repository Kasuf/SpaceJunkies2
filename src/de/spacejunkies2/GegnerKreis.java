package de.spacejunkies2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GegnerKreis extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private  int breite;
	 private  int hoehe;
	 private  int x;
	 private  int y;
	public GegnerKreis(int x,int y,int breite, int hoehe) {
		this.x = x;
		this.y = y;
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public void kreisMalen(Graphics g){
		g.setColor(new Color(230,0,0,100));
		g.fillOval(x, y, breite, hoehe);
	}
	
	public boolean kollision(double x1,double y1, double breite1, double hoehe1,double x2,double y2,double breite2,double hoehe2){
		return !(x1 > x2+breite2 || x1+breite1 < x2 || y1 > y2+hoehe2 || y1+hoehe1 < y2);
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public double getBreite(){
		return breite;
	}
	
	public double getHoehe(){
		return hoehe;
	}
	
	

}
