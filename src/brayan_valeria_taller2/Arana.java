package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Arana extends Thread {
	protected PApplet app;
	protected int x, y, nivel;
	protected PImage araña;
	protected boolean vivo;

	public Arana(PApplet app) {
		this.app = app;
		vivo = true;
	}

	public abstract void pintar();

	public void run() {
		try {
			while (vivo) {
				mover();
				sleep(50);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public boolean validar(Serpiente s) {
//if() {
//	return true;
//}else {
//	return false;
//}
//	}

	public abstract void mover();

	public void eliminarAraña() {

	}
}
