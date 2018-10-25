package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Araña extends Thread {
	protected PApplet app;
	protected int x, y, nivel;
	protected PImage araña;

	public Araña(PApplet app) {
		this.app = app;
	}

	public abstract void pintar();

	public void run() {

	}

//	public boolean validar(Serpiente s) {
//if() {
//	return true;
//}else {
//	return false;
//}
//	}

	public abstract void mover();

}
