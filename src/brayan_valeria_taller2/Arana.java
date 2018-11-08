package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public abstract class Arana extends Thread {
	protected PApplet app;
	protected int nivel;
	protected PVector pos;
	protected PImage arana;
	protected boolean vivo;
	protected int tam;

	public Arana(PApplet app) {
		this.app = app;
		vivo = true;
		tam = 40;
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

	public abstract void mover();

	public void eliminarAraña() {

	}
}
